package strategy.sale.optimal_design;


/**
* 满fullLevel减reduce
* */
public class PurchaseByNDiscount implements DiscountStrategy<Double> {

   public Double discount(Double purchasedByN,Double originPrice){
       if(purchasedByN>=0){
           return purchasedByN;
       }
       return 0D;
    }
}
