package strategy.sale.optimal_design;


import java.util.Map;

/**
* 满fullLevel减reduce
* */
public class DirectionReduceDiscount implements DiscountStrategy<Double> {

   public Double discount(Double reduce,Double originPrice){
       Double resPrice = originPrice-reduce;
       return resPrice>0?resPrice:0;
    }
}
