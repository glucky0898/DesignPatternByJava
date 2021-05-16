package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<EventType>... eventTypeEnums){
        for(Enum<EventType> eventTypeEnum:eventTypeEnums){
            listeners.put(eventTypeEnum,new ArrayList<>());
        }
    }
    public boolean registerEvent(Enum<EventType> eventTypeEnum,EventListener eventListener){
        List<EventListener> list = listeners.get(eventTypeEnum);
        list.add(eventListener);
        return true;
    }
    public boolean removeEvent(Enum<EventType> eventTypeEnum,EventListener eventListener){
        List<EventListener> list = listeners.get(eventTypeEnum);
        list.remove(eventListener);
        return true;
    }
    public boolean notify(Enum<EventType> eventTypeEnum, DrawLotsResult drawLotsResult){
        List<EventListener> list = listeners.get(eventTypeEnum);
        for(EventListener listener:list){
            listener.doEvent(drawLotsResult);
        }
        return true;
    }

    public enum EventType{
        MQ,Message;
    }
}

