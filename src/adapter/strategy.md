# 策略模式定义

# bad_design
  ## 单纯继承
   * 需求：刚开始业务需求中,鸭子的类别有MallardDuck、RedHeadDuck、RubberDuck。因此将这些鸭子抽象出Duck类，并将这些鸭子共同的行为(swim、display、quack)放在父类Duck类中  
   * 目前模式存在的问题：RubberDuck由于是橡皮鸭，只会"吱吱叫"，因此必须重新覆写quack方法
   * 新需求：新需求要求添加鸭子会飞的功能，因此在Duck中添加fly()方法。以及还添加了另一类鸭子DecoyDuck
   * 新需求带来的问题：由于添加了fly()方法，因此所有的鸭子都要实现fly()方法。RubberDuck不会飞，因此只能实现该方法，且方法体为空。新添加的RubberDuck是诱饵鸭，不会叫，也不会飞，因此实现的方法体都为空。
  ## 尝试改变
   * 思路：可以看出变化的部分为fly、quack方法，因此将他们独立处理。将他们各自封装到各自接口(FlyBehavior、QuackBehavior)中，只要某个类的鸭子有该行为就实现该接口中的方法。
   * 存在的问题：由于接口不能实现方法，只能在implement该接口的类中实现。导致不同类型的鸭拥有相同行为时，重复编写相同的具体实现，系统的复用性降低。
# optimal_design
