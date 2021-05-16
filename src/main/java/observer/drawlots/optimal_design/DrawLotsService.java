package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;

public abstract class DrawLotsService {
    private EventManager eventManager;
    public DrawLotsService(){
        eventManager = new EventManager();
        eventManager.registerEvent(EventManager.EventType.MQ,new MQEventListener());
        eventManager.registerEvent(EventManager.EventType.Message,new MQEventListener());
    }
    /**
     * 将主流程和辅助流程分开
    * */
    public DrawLotsResult draw(String uId){
        DrawLotsResult res = doDraw(uId);
        eventManager.notify(EventManager.EventType.MQ,res);
        eventManager.notify(EventManager.EventType.Message,res);
        return res;
    }
    protected abstract DrawLotsResult doDraw(String uId);
}
