package strategy.sale.optimal_design;


/**
* 满fullLevel减reduce
* */
public class RateDiscount implements DiscountStrategy<Double> {

   public Double discount(Double discountRate,Double originPrice){
       if(discountRate>=0){
           return originPrice*discountRate;
       }
       return 0D;
    }
}
