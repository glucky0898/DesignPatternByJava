package observer.drawlots.optimal_design;

import com.alibaba.fastjson.JSON;
import observer.drawlots.DrawLotsResult;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientTest {

    private Logger logger = LoggerFactory.getLogger(ClientTest.class);

    @Test
    public void test() {
        DrawLotsServiceImpl lotteryService = new DrawLotsServiceImpl();
        lotteryService.getEventManager().registerEvent(EventManager.EventType.Message,new MessageEventListener());
        lotteryService.getEventManager().registerEvent(EventManager.EventType.MQ,new MQEventListener());
        DrawLotsResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
