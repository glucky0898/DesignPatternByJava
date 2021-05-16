package observer.drawlots.optimal_design;

import com.alibaba.fastjson.JSON;
import observer.drawlots.DrawLotsResult;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        DrawLotsService lotteryService = new DrawLotsServiceImpl();
        DrawLotsResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
