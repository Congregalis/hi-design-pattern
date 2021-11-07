# 简单工厂方法

简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。

![](simple_factory.png) 

(图来自 pdai.tech)

我们有一个接口 Product，和两个具体实现了这个接口的真正商品类 ConcreteProduct1 和ConcreteProduct2 。