package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class DrawLotsService {
    private EventManager eventManager;
    public DrawLotsService(){
        eventManager = new EventManager();
    }
    /**
     * 将主流程和辅助流程分开
    * */
    public DrawLotsResult draw(String uId){
        DrawLotsResult res = doDraw(uId);
        Map<Enum<EventManager.EventType>, List<EventListener>> map = eventManager.getListeners();
        eventManager.notify(res,map.keySet().stream().toArray());
        return res;
    }
    protected abstract DrawLotsResult doDraw(String uId);

    public EventManager getEventManager() {
        return eventManager;
    }
}
