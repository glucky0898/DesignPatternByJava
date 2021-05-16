package observer.drawlots.bad_design;

import observer.drawlots.DrawLotsAlgorithm;
import observer.drawlots.DrawLotsResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class DrawLotsServiceImpl implements DrawLots{
    private DrawLotsAlgorithm drawLotsAlgorithm = new DrawLotsAlgorithm();
    private Logger logger =
            LoggerFactory.getLogger(DrawLotsServiceImpl.class);
    /**
     * 主流程为摇号，辅流程为发送各种消息
     * */
    public DrawLotsResult draw(String uId){
        String lotRes = drawLotsAlgorithm.lottery(uId);
        // 发短信
        logger.info("给⽤户 {} 发送短信通知(短信)： {}", uId, lotRes);
        // 发MQ消息
        logger.info("记录⽤户 {} 摇号结果(MQ)： {}", uId, lotRes);
        // 结果
        return new DrawLotsResult(uId, lotRes, new Date());
    }
}
