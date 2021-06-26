package decorator.coffee.optimal_design.starbuzz;

/**
  调料装饰类的父类
* */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
