 # 装饰者模式定义
 * 定义：结构性模式，允许向现有的对象添加新的功能，又不需要改变现有对象的结构。这种模式创建了一个装饰类(如CondimentDecorator、SsoDecorator)，用于包装原有的类(如SsoInterceptor、DarkRoast)
 * 意图：动态的给现有类增加额外的职责，且不改变现有类的结构。装饰器主要解决直接继承下，因功能的不断横向扩展导致子类膨胀问题。装饰器比直接继承更加灵活，不再需要考虑子类的维护。
 * 关键代码：
    1. 抽象构建角色(Component):定义为接口。如HandleInterceptor
    2. 具体构建角色(ConcreteComponent):实现Component接口。该类为被装饰类。如SsoInterceptor
    3. 装饰角色(Decorator):定义为抽象类，同时继承Component类。该类包含了一个引用Component类的成员变量。如SsoDecorator
    4. 具体装饰对象(ConcreteDecorator):继承Decorator。该类为装饰类，通过调用ConcreteComponent类的成员变量的方法，以及实现Component接口中的方法，完成对ConcreteComponent的装饰，即给ConcreteComponent类增加额外职责。如LoginSsoDecorator
 * 优点：装饰类(功能开放的类)和被装饰类(功能关闭的类)独立，不互相耦合。该模式是继承的一个替代模式，可动态扩展一个实现类的功能。
 * 缺点：多层装饰导致代码比较复杂，调用链路层次深。且可能存在大量的代码量少的装饰类。
 * 使用场景：1、扩展一个类的功能。 2、动态增加功能，动态撤销。
# starbuzz
* 需求：咖啡店有很多种咖啡，每种咖啡价钱不同，有深焙咖啡DarkRoast、低咖咖啡Decaf、综合咖啡HouseBlend，价格不一样。除了咖啡外，还可以加调料如：奶泡Whip、牛奶Milk、摩卡Mocha、豆浆Soy等，这些也需要额外收费。用户可以根据自己喜好，在咖啡中加入不同调料。结账时，总价钱为咖啡价格和总调料价格之和。
## bad_design
   ### 单纯继承
   * 目前模式存在的问题：
      1. 每一个新品种的咖啡产生，Beverage就有多一个子类。导致子类膨胀
      2. 当有新的调料品种增加时，需要修改Beverage父类。或者当调料价格变化时，需要修改咖啡类DarkRoast、Decaf。不符合 **[修改关闭-扩展开放]** 原则。
      3. 子类继承Beverage，有些咖啡不应该有这类的调料，因此产生了继承不合适的方法和属性。
## optimal_design
   * 【被装饰者】有DarkRoast、HouseBlend等不同咖啡，这些咖啡需要被添加调料
   * 【装饰者】有Milk、Mocha、Soy等调料。该【装饰者】持有【被装饰者】的变量引用。
   * 由于每个【装饰者】都有一个【被装饰者】/【装饰者】的变量引用，【装饰者】持有其他【装饰者】，层层装饰，形成一条方法链。因此可以运行时动态地、不限量地用你需要的【装饰者】装饰【被装饰者】。从而可以动态扩展，增加新的行为，而不需要修改【被装饰者】。
   * 【装饰者】的父类为CondimentDecorator，该类也继承了Beverage。即【装饰者】和【被装饰者】有相同的父类。之所以这么做，不是为了利用继承获得相同"行为"，而是为了达到"类型匹配"。
   * 装饰者模式一般为抽象类，也可以用接口。
# ssoInterceptor (SingleSignOn，SSO，单点登录)
* 需求：最初需求是，用户发来请求时只需要验证用户携带的cookie是否符合要求。后面需要增加对请求的方法进行验证。
 ## bad_design
   ### 单纯继承
   * 单纯继承存在的问题：
     1. 当有新需求时，需要创建子类编写新的需求。
     2. 复用性低，组合性差。单点登陆，需要验证多个功能点时，只能通过继承来扩展功能。
 ## optimal_design
   * 改进的点：
     使用装饰器满足开闭原则，通过在装饰类中编写扩展的功能逻辑，既完成了被装饰类的职能扩展，又不改变被装饰类的原有功能。同时，该扩展的功能逻辑可在运行时动态的添加和删除。
 ## 总结
   1. 在设计中，应该允许行为可被扩展，而无须修改现有的代码
   2. 组合和委托可用于运行时动态地添加其他行为
   3. 除了继承，装饰者模式可扩展行为
   4. 装饰者和被装饰者具有相同的类型
   5. 装饰者的行为可以在被装饰者的行为前或者后。
