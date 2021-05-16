package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;

public interface EventListener {
    public void doEvent(DrawLotsResult res);
}
