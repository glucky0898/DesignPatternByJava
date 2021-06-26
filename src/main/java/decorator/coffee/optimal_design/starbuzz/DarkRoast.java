package decorator.coffee.optimal_design.starbuzz;

/**
 * 被装饰的对象
* */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}
}

