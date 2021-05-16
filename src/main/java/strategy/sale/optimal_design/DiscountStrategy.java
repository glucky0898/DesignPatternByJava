package strategy.sale.optimal_design;

public interface DiscountStrategy<T> {
    Double discount(T relativeDiscount,Double originPrice);
}
