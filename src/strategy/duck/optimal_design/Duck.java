package strategy.duck.optimal_design;

public abstract class Duck {
    public Duck() {
    }
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public void quack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("游泳");
    }
    public abstract void display();
    //新需求
    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
