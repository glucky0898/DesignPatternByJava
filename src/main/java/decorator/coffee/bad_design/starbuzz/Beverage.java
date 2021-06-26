package decorator.coffee.bad_design.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
    private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public boolean hasMilk() {
		return milk;
	}

	public boolean hasSoy() {
		return soy;
	}

	public boolean hasMocha() {
		return mocha;
	}

	public boolean hasWhip() {
		return whip;
	}
}
