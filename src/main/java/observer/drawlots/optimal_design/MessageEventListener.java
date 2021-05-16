package observer.drawlots.optimal_design;

import observer.drawlots.DrawLotsResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageEventListener implements EventListener{
    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);
    public void doEvent(DrawLotsResult result){
        logger.info("给用户 {} 发送短信通知(短信)：{}", result.getuId(), result.getMsg());
    }
}
