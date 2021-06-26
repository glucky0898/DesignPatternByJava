package decorator.coffee.optimal_design.starbuzz;
/**
 * 被装饰组件的父类
* */
public abstract class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
