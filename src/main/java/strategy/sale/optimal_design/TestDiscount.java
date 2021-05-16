package strategy.sale.optimal_design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestDiscount {
    private Logger logger = LoggerFactory.getLogger(TestDiscount.class);
    @Test
    public void purchaseByNDiscount(){
        StrategyContext<Double> context = new StrategyContext(new RateDiscount());
        Double res = context.discountAmount(0.8D,100D);
        logger.info("测试结果：折扣9折后金额 {}",res);
    }
    @Test
    public void fullLevelDiscount(){
        StrategyContext<Map<String,Double>> context = new StrategyContext(new FullLevelDiscount());
        Map<String,Double> map = new HashMap<String, Double>(){
            {
                put("fullLevel",100D);
                put("reduce",50D);
            }
        };
        Double res = context.discountAmount(map,100D);
        logger.info("测试结果：满减后金额 {}",res);
    }

}
