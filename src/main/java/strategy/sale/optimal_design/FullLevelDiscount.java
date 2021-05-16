package strategy.sale.optimal_design;


import strategy.sale.bad_design.SaleDiscountService;

import java.util.Map;
/**
* 满fullLevel减reduce
* */
public class FullLevelDiscount implements DiscountStrategy<Map<String,Double>> {

   public Double discount(Map<String,Double> relativeDiscount,Double originPrice){
        Double fullLevel = relativeDiscount.get("fullLevel");
        Double reduce = relativeDiscount.get("reduce");
        return originPrice>fullLevel?originPrice:originPrice-reduce;
    }
}
