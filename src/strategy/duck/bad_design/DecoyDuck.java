package adapter.duck.bad_design;

public class DecoyDuck extends Duck {
    public void display(){
        System.out.println("我是诱饵鸭");
    }
    //诱饵鸭不会叫也不会飞,因此只能覆盖quack方法以及实现fly时，方法体为空
    public void quack(){

    }
    public void fly(){

    }
}
