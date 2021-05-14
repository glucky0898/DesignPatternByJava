package adapter.duck.bad_design;
public class RubberDuck extends Duck{
    //修改父类的实现方法不同，进行修改
    public void quack(){
        System.out.println("吱吱叫");
    }
    public void display(){
        System.out.println("我是橡皮鸭");
    }
    //由于继承了Duck，必须实现该方法，但由于RubberDuck不会飞，给出这个方法在逻辑上有问题
    public void fly(){

    }
}
