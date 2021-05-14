设计模式的原则:  

 1. 区分应用中变化和不变化内容，将变化的部分独立处理并进行封装，使变化的部分不影响变化部分，而变化部分可以随时添加或者删除，保证系统更加有弹性
 
 2. 面向接口编程，而不是针对实现编程。利用接口代表每个行为，当行为不同时，可以将该行为独立封装。接着编写接口，不同行为封装成一个类并都实现该接口，类中编写具体的行为逻辑
 
 3. 多用组合，少用继承。继承会使方法"写死"。当变化的部分也在继承中时，还会导致系统的复用性降低。而组合可让系统更加有弹性。 
 
 ## Reference
 - [HeadFirst](https://github.com/bethrobson/Head-First-Design-Patterns)
 - [小傅哥](https://gitee.com/fustack/itstack-demo-design)
 - [菜鸟教程：设计模式](https://www.runoob.com/design-pattern/design-pattern-intro.html)