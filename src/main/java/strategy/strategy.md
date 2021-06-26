 # 策略模式定义
1. 将一个类中的行为或算法(可统称为策略)从其成员变量中单独拎出，封装成类。在使用类对象时，可随时改变对象的行为。
2. 优点在与算法或者行为可随时切换，避免了多重的if else逻辑判断，扩展性好。缺点在于该策略类会增多，所有策略类都需要对外暴露
3. 它所能帮你解决的是场景，⼀般是具有同类可替代的⾏为逻辑算法场景。⽐如；不同类型的交易⽅式(信⽤卡、⽀付宝、微信)、⽣成唯⼀ID策略(UUID、 DB⾃增、 DB+Redis、雪花算法、 Leaf算法)等，都可以使⽤策略模式进⾏⾏为包装，供给外部使⽤。
# Duck
## bad_design
  ### 单纯继承
   * 需求：刚开始业务需求中,鸭子的类别有MallardDuck、RedHeadDuck、RubberDuck。因此将这些鸭子抽象出Duck类，并将这些鸭子共同的行为(swim、display、quack)放在父类Duck类中  
   * 目前模式存在的问题：RubberDuck由于是橡皮鸭，只会"吱吱叫"，因此必须重新覆写quack方法
   * 新需求：新需求要求添加鸭子会飞的功能，因此在Duck中添加fly()方法。以及还添加了另一类鸭子DecoyDuck
   * 新需求带来的问题：由于添加了fly()方法，因此所有的鸭子都要实现fly()方法。RubberDuck不会飞，因此只能实现该方法，且方法体为空。新添加的RubberDuck是诱饵鸭，不会叫，也不会飞，因此实现的方法体都为空。
  ### 尝试改变
   * 思路：可以看出变化的部分为fly、quack方法，因此将他们独立处理。将他们各自封装到各自接口(FlyBehavior、QuackBehavior)中，只要某个类的鸭子有该行为就实现该接口中的方法。
   * 存在的问题：由于接口不能实现方法，只能在implement该接口的类中实现。导致不同类型的鸭拥有相同行为时，重复编写相同的具体实现，系统的复用性降低。
## optimal_design
   * 改进的点：
     1. 改进的点在于将变化的部分quark、fly行为这两种和其他行为分离开(区分变化和不变化)
     2. 将quark、fly各自放入到接口(面向接口编程)
     3. 将该接口作为Duck类的成员变量(多实用组合)
   * 优点
     1. 对于不同的Duck只需要改变FlyBehavior、QuackBehavior的实现对象即可改变鸭子的行为(可维护性)
     2. 鸭子子类只需要使用FlyBehavior、QuackBehavior的实现对象，不需要自己再实现(可复用性)
     3. 当有新的需求时，开发人员只需要添加FlyBehavior、QuackBehavior的实现对象即可，不需要修改系统的原有功能(可扩展性)
# DiscountStrategy
 ## bad_design
   * if else简单粗暴，适合简单的业务。随着需求的不断增加，type类型也增加，参数类型也可能变化。当需求增加或者改变时，需要修改SaleDiscountService内部类，且不断扩张方法中的if语句。代码变得冗长且难以维护和修改。
 ## optimal_design
   * 将不可控的类型type去除，增加接口DiscountStrategy以及使用泛型表示入参类型，从而应对所有变化的参数类型
   * 将if else的策略处理这部分变化的部分提取出来，独立构建DiscountStrategy的实现类。当需求改变或者增加时，只需要添加或者修改DiscountStrategy的实现类，而不需要修改StrategyContext内部方法，是系统的可扩展性良好，也易于维护。

     
