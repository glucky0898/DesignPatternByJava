package decorator.coffee.bad_design.starbuzz;

public class DarkRoast extends Beverage {
	public DarkRoast(boolean milk,boolean soy,boolean mocha,boolean whip) {
		setMilk(milk);
		setSoy(soy);
		setMocha(mocha);
		setWhip(whip);
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		double res = .99;
		res+=hasMilk()?.10:0;
		res+=hasSoy()?.15:0;
		res+=hasMocha()?.20:0;
		res+=hasWhip()?.10:0;
		return res;
	}
}

