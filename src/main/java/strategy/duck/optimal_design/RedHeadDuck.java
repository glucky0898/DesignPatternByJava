package strategy.duck.optimal_design;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    public RedHeadDuck(QuackBehavior quackBehavior,FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public void display(){
        System.out.println("我是红头鸭");
    }
}
