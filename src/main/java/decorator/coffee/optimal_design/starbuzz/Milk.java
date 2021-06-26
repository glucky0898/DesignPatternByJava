package decorator.coffee.optimal_design.starbuzz;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost(){
        return beverage.cost()+0.10;
    }
    public String getDescription(){
        return beverage.getDescription()+",调料Milk";
    }
}
