package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsAlgorithm;
import observer.drawlots.DrawLotsResult;

import java.util.Date;

public class DrawLotsServiceImpl extends DrawLotsService{
    private DrawLotsAlgorithm drawLotsAlgorithm = new DrawLotsAlgorithm();
    @Override
    public DrawLotsResult doDraw(String uId){
        String lotRes = drawLotsAlgorithm.lottery(uId);
        return new DrawLotsResult(uId, lotRes, new Date());
    }
}
