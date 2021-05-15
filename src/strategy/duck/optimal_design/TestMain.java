package strategy.duck.optimal_design;

public class TestMain {
    public static void main(String[] args) {
        //默认的
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.fly();
        redHeadDuck.quack();
        //按照目前已有的定制
        RedHeadDuck newRedHeadDuck = new RedHeadDuck(new FakeQuack(),new FlyRocketPowered());
        newRedHeadDuck.fly();
        newRedHeadDuck.quack();
        //按照系统未有的功能定制新的
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RedHeadDuck addRedHeadDuck = new RedHeadDuck(squeak,cantFly);
        addRedHeadDuck.fly();
        addRedHeadDuck.quack();
    }
}
