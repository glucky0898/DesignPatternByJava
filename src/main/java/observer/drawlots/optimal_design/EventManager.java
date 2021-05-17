package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(){
    }
    public boolean registerEvent(Enum<EventType> eventTypeEnum,EventListener eventListener){
        List<EventListener> list = listeners.get(eventTypeEnum);
        if(list == null){
            listeners.put(eventTypeEnum,new ArrayList<>());
            return listeners.get(eventTypeEnum).add(eventListener);
        }
        return list.add(eventListener);
    }
    public boolean removeEvent(Enum<EventType> eventTypeEnum,EventListener eventListener){
        List<EventListener> list = listeners.get(eventTypeEnum);
        if(list !=null && list.size()>0){
            return list.remove(eventListener);
        }
        return false;
    }
    public boolean notify(DrawLotsResult drawLotsResult,Object... eventTypeEnums){
        for(Object eventTypeEnum:eventTypeEnums){
            List<EventListener> list = listeners.get((Enum<EventType>)eventTypeEnum);
            for(EventListener listener:list){
                listener.doEvent(drawLotsResult);
            }
        }
        return true;
    }

    public Map<Enum<EventType>, List<EventListener>> getListeners() {
        return listeners;
    }

    public enum EventType{
        MQ,Message
    }
}

