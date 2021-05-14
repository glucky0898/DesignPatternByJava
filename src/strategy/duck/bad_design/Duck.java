package adapter.duck.bad_design;

public abstract class Duck {
    public void quack(){
        System.out.println("呱呱叫");
    }
    public void swim(){
        System.out.println("游泳");
    }
    public abstract void display();
    //新需求
    public abstract void fly();
}
