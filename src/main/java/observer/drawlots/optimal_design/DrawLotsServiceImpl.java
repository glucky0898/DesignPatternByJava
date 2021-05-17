package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsAlgorithm;
import observer.drawlots.DrawLotsResult;

import java.util.Date;

public class DrawLotsServiceImpl extends DrawLotsService{
    private DrawLotsAlgorithm drawLotsAlgorithm = new DrawLotsAlgorithm();
    public DrawLotsServiceImpl(){
        //当父类有无参构造器时，会自动调用super()，不需要显示调用super()。因此这里可以不显示调用super()
        //当父类没有无参构造器时，必须显示调用super()，否则编译报错，或者显示调用父类的有参构造函数super(XXX)。
        //super()或者super(XXX)必须放在方法体的第一行，否则编译报错。
        super();
    }
    @Override
    public DrawLotsResult doDraw(String uId){
        String lotRes = drawLotsAlgorithm.lottery(uId);
        return new DrawLotsResult(uId, lotRes, new Date());
    }
}
