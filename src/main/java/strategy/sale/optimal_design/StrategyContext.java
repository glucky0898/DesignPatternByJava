package strategy.sale.optimal_design;

public class StrategyContext<T> {
    DiscountStrategy<T> discountStrategy;
    public StrategyContext(DiscountStrategy<T> discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    public Double discountAmount(T relativeDiscount,Double originPrice){
        return discountStrategy.discount(relativeDiscount,originPrice);
    }
}
