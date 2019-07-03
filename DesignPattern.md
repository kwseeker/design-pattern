## Java 设计模式

理解 Java 设计模式对理解 JavaWeb 框架比较重要。

学习每种设计模式都要关注其设计思想、类图、应用场景。  
还要关注设计模式之间的关系。  

设计模式通常都不是单独存在的。

设计模式貌似不存在很精确的表述，只是一个大概的样子。

#### 创建型模式

+ **singleton 单例模式**

+ **factoryMethod 工厂方法模式**

+ **abstractFactory 抽象方法模式**

+ **builder 建造者模式** (分离建造过程和表示[图纸]，类似多功能流水线)

    > The Builder is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming.   
      The intent of the Builder design pattern is to separate the construction of a complex object from its representation.

    建造者模式使用简单的对象一步步生成复杂的对象；
    
    个人感觉就像一条多功能流水线（如一条可以组装各种车型的造车流水线，或一条组装各种电脑的流水线，或者汉堡店套餐制作流水线）；
    分别对标 [维基百科案例](https://en.wikipedia.org/wiki/Builder_pattern)，本工程的案例，[runoob.com的案例](https://www.runoob.com/design-pattern/builder-pattern.html)。
    
    建造者模式一般包含以下几部分：
    
    - 建造指导思想 （IComputerBuilder） 
        决定我们要造什么，大概的流程。代码中通常是一个接口。
        比如：我们要造车而不是造电脑，造车大概流程：造汽车骨架，发动机，油箱，座椅，控制系统等等；
    
    - 建造图纸 (MacBuilder XiaomiBuilder)
        设计工程师根据老板的指导思想设计几种车型的详细的建造方案，包括汽车大小，组件选型，成本预算等等。
        
    - 建造组件 (Box Cpu HardDisk Memory MotherBoard Power)
        车骨架、发动机、油箱、座椅、控制系统等等。  
        建造组件不一定是一成不变的，每种组件也可能分为好多类。
    
    - 流水线（Director）
        拿着图纸规划进行生产的组装流水线。
    
    实际案例：
    
    - Web框架中的Builder
    
        * Mybatis 中建造者模式
        
            ![Mybatis建造者模式类图](picture/MybatisBuilder.png)
        
            这里的几个Builder实现类除了建造组件都是Configurations等配置数据，
            没有统一的指导思想和共用的流水线；每个Builder有自己的生产线 parse()。
            
            感觉并不是Builder模式，因为建造过程(parse())和表示(XMLXxxBuilder)没有分离；而且这里的场景，
            建造过程并不通用。

+ prototype 原型模式

#### 结构型模式

+ **adapter 适配器模式**

+ bridge 桥接模式

+ composite 组合模式

+ **decorator 装饰模式**

+ facade 外观模式（门面模式）

    要求一个子系统的外部与其内部的通信必须通过一个统一的对象。
    okhttpClient就是使用的门面模式。okhttpClient包含了post，url等对象。

    Slf4j 中使用的是外观模式，不是代理模式。
    
    Facade外观模式、proxy代理模式、mediator中介者模式的区别：

+ flyWeight 享元模式

+ **proxy 代理模式**

    代理模式分类：  
    
    - 静态代理
    
        代理对象保持被代理对象的引用，代理对象的方法调用被代理对象的方法。  
        静态代理不方便业务拓展，被代理对象拓展了业务，代理对象的代码也要响应的做出修改。
    
    - 动态代理（针对上面问题的改进型）  
        
        使用反射的机制生成一个继承被代理类的动态代理类，然后使用这个生成的动态代理类
        实现业务逻辑。
        
        动态代理的原理（字节码重组）：  
        1 拿到被代理对象的引用，并且反射获取它的所有接口  
        2 JDK Proxy 重新生成一个新的类，同时新的类要实现被代理类所有实现方法（方法内部还是通过反射调用愿对象的方法）  
        3 动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用  
        4 重新编译新生成的Java代码.class （com.sun.proxy.$Proxy0 这个是运行时动态生成的，可以通过反编译工具查看代码）
        5 再重新加载到JVM中运行
        
        相对于静态代理优势：    
        动态代理避免了接口修改的时候造成的代理类的修改；  
        动态代理可以代理大量不同种类的对象，静态代理只能代理一种类型的对象。
    
    动态代理和静态代理最大的不同：静态代理在代理之前需要知道被代理对象所有的信息（通常是持有被调离对象的实例引用）；
    而动态代理不需要知道被代理类的信息，而是代理时通过反射获取被代理对象的信息（可以使用JDK反射或者使用CGLib实现）。
    
    代理模式的优点：
    
    - 解耦
    
    代理模式使用案例：  
    
    - Spring AOP
    - 拦截器 
    
    Spring AOP 代理实现原理？
   
#### 行为型模式

+ visitor 访问者模式

+ **template 模板模式**

    业务流程固定，但是业务的每一步有些许变化。
   
    使用案例：
    
    - Spring 中众多的Template, 如：JdbcTemplate、RedisTemplate etc

+ **strategy 策略模式**（实现最终目的的方式有多个，但我们不是根据名称选择具体的方法，而是直接选择实现方式的类调用其方法）

    方便拓展策略而不影响现有代码。

    应用场景：  
    根据用户需求处理数据的时候需要对算法（算法类型固定不变）做出选择；  
    比如条条大路通罗马，大路的走向和条数基本不变，就可以使用策略模式实现旅行规划。  
    又比如：网上购物有三种支付方式，微信支付，支付宝支付，银联卡支付，也可以使用策略模式实现。  
    登录方式。
    
    使用策略模式应该注意如何保证策略的易拓展性；推荐使用 Enum 。  
    使用策略模式，以后面对上面类似场景就再也不用 switch 和 if else 了。  
    
    使用案例：
    
    - 比较器 Comparator
        
        ```
        new ArrayList<String>().sort(new Comparator() { //重新定义一种比较策略
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2)；
            }
        });
        ```
        
    - Spring 创建 Bean 时选择 BeanFactory 类型

+ **state 状态模式**

+ **observer 观察者模式**

+ memento 备忘录模式

+ mediator 中介者模式

+ iterator 迭代器模式

+ interpreter 解释器模式

+ **command 命令模式**

+ chainOfResponsibility 责任链模式（请求和处理解藕，请求不做判断直接丢给处理者，处理者判断能不能处理，然后传给其他处理者）

    [使用责任链优化前后对比的案例--采购部采购审批](https://blog.csdn.net/justloveyou_/article/details/68489505)

    Web框架中这种模式的应用还是挺多的。

    责任链模式讲的就是将请求的发送者和接收者进行分离，避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，
    并且沿着这条链传递请求，直到有对象处理它为止，面对需求变更，只需要更加处理类就好了，而且客户端可以按照自己的需求拼接处理链条。  
    (每个处理器是链表的一个节点，所有处理器连成一条链，请求从第一个处理器开始处理(处理器内部决定要不要处理这个请求))。
    
    优点：  
    责任链模式将请求和处理分开，请求者不知道是谁处理的，处理者可以不用知道请求的全貌。  
    提高系统的灵活性。  
    
    缺点：  
    降低程序的性能。每个请求都是从链头遍历到链尾，当链比较长的时候，性能会大幅下降。  
    不易于调试。由于该模式采用了类似递归的方式，调试的时候逻辑比较复杂。
    
    使用限制：
    被处理的对象的处理模式固定，如果每次来的对象的处理方式经常变就不适合用责任链，不然每次都要添加新的处理器节点，还降低性能。
    
    使用案例：
    
    - Spring MVC Filter/Interceptor，Spring Security 的认证链
    - Netty 的 ChannelHandler 应该也是
    
#### 其他模式

+ 委派模式   

## 设计原则（6）

#### 单一职责

要求实现类要职责单一。

#### 里氏替换原则

要求不要去破坏继承系统，每个实现类都可以使用其接口代替。

#### 依赖倒置原则

面向接口编程。

#### 接口隔离原则

设计接口的时候要精简单一。

#### 迪米特法则（最少知道原则）

要降低耦合。

#### 开闭原则（Open Close Principle）   

要求对扩展开放，对修改关闭。即拓展业务的时候是增加新的模块代码，而不是修改旧有模块的代码。
