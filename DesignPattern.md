# 设计模式-Java实现

 在软件工程中，设计模式是针对软件设计中常见问题的通用可重复解决方案。理解Java 设计模式对理解开源框架以及写出优雅易用可拓展的项目很重要。

学习每种设计模式都要关注其设计思想、类图、应用场景。  
还要关注设计模式之间的关系。  

设计模式通常都不是单独存在的。

设计模式貌似不存在很精确的表述，只是一个大概的样子。



## 设计原则（7种）

“少改多拓展，职责单一、面向抽象类和接口编程、多组合少继承、高内聚低耦合”。

+ **开闭原则**（加代码而不是改代码，即少改多拓展）   

    要求项目上线后对扩展开放，对修改关闭。即拓展业务的时候是增加新的模块代码，而不是修改旧有模块的代码。

    ---

+ **单一职责原则**（类职责单一）

  要求实现类要职责单一，防止某个业务场景的修改影响到其他业务代码。（比如controller、service、dao分开，而不是写到一起）

+ **接口隔离原则**（接口职责单一）

  设计接口的时候要精简单一。

  ---

+ **里氏替换原则**（父类出现的地方都可以替换为子类，子类包含父类所有功能）

  在程序中尽量使用基类类型对对象进行定义，运行时由虚拟机确定其子类类型并替换。

+ **依赖倒置原则**（和里氏替换类似，用接口替换实现类）

    面向接口编程不是面向实现编程。代码调用处使用接口类调用功能而不是通过具体的实现类调用功能。

    ---

+ **合成复用原则**（尽量使用组合而不是继承）

+ **迪米特法则**（最少知道原则）

    类与类之间要高内聚低耦合。



## 设计模式

### 创建型模式

#### **singleton 单例模式**

**特点**:

1）构造器私有，不允许手动new对象；

2）静态成员变量；

3）提供一个公开静态访问方法，获取单例对象。

**使用场景：**

+ Spring 单例 Bean
+ 数据库连接池
+ 全局属性的保存
+ ......

**实现方式：**

+ 饿汉模式（常用，使用前提前创建）

+ 懒汉模式（不常用，线程不安全）

+ 同步锁懒汉模式（不常用）

+ 双重检查锁+volatile懒汉模式（常用）

+ 静态内部类，本质和懒汉模式一样

+ 枚举单例模式（《Effective Java》推荐）

  绝对防⽌外部通过私有构造器和序列化反序列化对单例类实例化，即使是在⾯对复杂的串⾏化或者反射攻击的时候；像其他饿汉模式对于享有特权的客户端仍可借助AccessibleObject.setAccessible方法，通过反射机制调用私有构造器实例化。

  > 关于枚举单例模式的优点，
  >
  > 参考《Effective Java》，或者看 [为什么要用枚举实现单例模式（避免反射、序列化问题）](https://blog.csdn.net/u011277123/article/details/104523638)

比较多用的DCL+volatile单例模式。

**拓展问题**：

1）为什么饿汉式单例是线程安全的？

​	因为饿汉单例在用获取单例对象的方法获取单例时，单例对象已经被创建得到的总是同一个对象实例。​而第一次被调用获取单例方法加载对象的时候，JVM也是会对加载对象的线程进行加锁。

#### **simpleMethod 简单工厂模式**

解决的问题：类构造细节复杂，通过简单工厂封装掩盖实现细节。

- **Spring对简单工厂模式的优化**

  简单工厂模式工作太重，不符合开闭原则。

  Spring Bean容器内部使用的是Map存储Bean实例，可以直接通过map.get(name)直接获取Bean实例。

  替代了很”重“的if...else...。

#### **factoryMethod 工厂方法模式**

用于优化简单工厂，简单工厂创建对象前，要判断创建哪种对象。这个工厂负责的产品总类多，内部实现复杂。

工厂方法模式的优化思想是“专品专厂”，为每种产品创建一个工厂。我们先创建它的专属工厂，然后看需要哪种产品就用对应的工厂创建具体的对象实例。

![](https://www.runoob.com/wp-content/uploads/2018/07/1530601917-1999-DP-Factory.png)

#### **abstractFactory 抽象工厂模式**

针对产品内部有细分组件的场景（产品族，比如一辆车有轮胎，发动机，座椅等，有奔驰、宝马等产品族）。

对于每一个产品族仍然有一个对应的工厂，这个工厂实现一个创建各个组件的接口，最后组装成目标产品实例。

![](https://www.runoob.com/wp-content/uploads/2018/07/1530601916-7298-DP-AbstractFactory.png)

> 工厂方法模式和抽象工厂模式的关系：
>
> 工厂方法模式可以说是抽象方法模式的一种特殊情况
>
> 当抽象方法模式中每个产品族只包含一个产品时，抽象工厂就变成了工厂方法模式。

#### **builder 建造者模式** (分离建造过程和表示[图纸]，类似多功能流水线)

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

    * Mybatis 中 Builder
    
        ![Mybatis建造者模式类图](picture/MybatisBuilder.png)
    
        这里的几个Builder实现类除了建造组件都是Configurations等配置数据，
        没有统一的指导思想和共用的流水线；每个Builder有自己的生产线 parse()。
        
        感觉并不是Builder模式，因为建造过程(parse())和表示(XMLXxxBuilder)没有分离；而且这里的场景，
        建造过程并不通用。

#### **prototype 原型模式**

原型模式就是对象复制。复制分为深复制和浅复制。

- **浅复制**

  实现Clonable接口（只是标示接口），只需要调用Object类的clone方法（调用的native方法）；

  只将对象的基本类型和String类型进行复制，其他引用类型对象不会复制（直接copy内存地址）

  ```java
  public class User implement Clonable {
      //成员
      private String Name;
      private Info info;
      //浅复制方法
      public Object shallowClone() throws CloneNotSupportedException {
      	User user = (User)super.clone();
      	return user;
      }
  }
  
  //浅复制
  User user = new User();
  User newUser = (User)user.shallowClone();
  ```

- **深复制**

  1) 实现Serializable接口（只是标示接口），调用对象字节序列化流。

  主要就是将对象读到字节流，然后再把字节流内容读成对象的过程。

  ```java
  public class User implement Serializable {
      //成员
      private String Name;
      private Info info;
      //深复制方法
      public Object deepClone() throws IOException, ClassNotFoundException {
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream(bos);
          oos.writeObject(this);
          ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
          ObjectInputStream ois = new ObjectInputStream(bis);
          return ois.readObject();
      }
  }
  
  //深复制
  User user = new User();
  User newUser = (User)user.deepClone();
  ```

  2) 某个类所有成员对象类包括成员对象类的成员对象类一层一层深入全部实现Clonable接口也是可以实现深度复制的。

### 结构型模式

#### **adapter 适配器模式**

适配器模式用于将某个标准转换成另外一种标准。

+ **类的适配器模式**

    基于继承。

+ **对象的适配器模式**

    基于组合模式。

使用案例：

- Spring MVC HandlerAdapter

  使用策略模式获取请求对应的处理器，然后使用适配器模式将HandlerAdapter（接口）的实现类如SimpleControllerHandlerAdapter转换为HandlerAdapter。

#### bridge 桥接模式

#### composite 组合模式

#### **decorator 装饰模式**

#### facade 外观模式（门面模式）

要求一个子系统的外部与其内部的通信必须通过一个统一的对象。
okhttpClient就是使用的门面模式。okhttpClient包含了post，url等对象。

Slf4j 中使用的是外观模式，不是代理模式。

Facade外观模式、proxy代理模式、mediator中介者模式的区别：

#### flyWeight 享元模式

#### **proxy 代理模式**

代理模式解决的问题：  

将目标类不擅长的工作交给代理类去做；  
对于模版性的代码，可以交给代理模式去做；  
为了不修改原来代码的情况下，进行代码增强。  

注意增强功能默认对所有public方法都有增强，比如：toString()等继承Object的public方法，因为Interface类也是继承Object的。

代理模式分类：  

- **静态代理**

    代理对象保持被代理对象的引用，代理对象的方法调用被代理对象的方法。  
    静态代理不方便业务拓展，被代理对象拓展了业务，代理对象的代码也要响应的做出修改。

- **动态代理**（针对上面问题的改进型）  

    动态代理和静态代理的区别就是让JVM自动生成代理类而不是程序员手动编写代理类。程序员子需要提供被代理对象和代码增强（InvocationHandler实现类）就行了。

    常用动态代理方式： 

    - Jdk

      针对带有接口的类进行动态代理。

      **Jdk动态代理的原理**

      首先有三个角色：被代理对象（Target类），动态增强类（即实现InvocationHandler，增强比如：方法调用前开启事务、方法结束后提交或者回滚；还有我们自己写的切面逻辑），代理类。

      `代理类`是用`被代理类`和`动态增强类`组合在执行时动态生成的。

      ```java
      //被代理对象
      //	以用户服务实现类举例
      public class UserServiceImpl implements UserService {
      	@Override
      	public void saveUser() {
      		System.out.println("添加用户");
              //...
      	}
      }
      
      //动态增强
      //	包含一些增强的代码，比如添加些逻辑
      //	当然如果不用增强则在invoke中直接执行method.invoke()调用被代理类的方法并返回即可
      //	invoke()定义的增强对所有方法起效
      public class MyInvocationHandler implements InvocationHandler {
      	// 目标对象的引用, 代理类最终还是通过反射调用被代理类的方法实现功能，所以要传进来
      	private Object target;
      	// 通过构造方法将目标对象注入到代理对象中
      	public MyInvocationHandler(Object target) {
      		super();
      		this.target = target;
      	}
      	/**
      	 * 代理对象会执行的方法
      	 */
      	@Override
      	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      		System.out.println("这是jdk的代理方法");
      		// 下面的代码，是反射中的API用法
      		// 该行代码，实际调用的是[目标对象]的方法（利用反射，调用[目标对象]的方法）
      		Object returnValue = method.invoke(target, args);
              // AOP动态代理增强
      		// AopUtils.invokeJoinpointUsingReflection(this.advised, method, args);
      		// ReflectiveMethodInvocation.proceed()进行递归增强
              
      		// 增强的部分
              //...
      		return returnValue;
      	}
      }
      
      //代理类生成：被代理对象+动态增强，通过Proxy.newProxyInstance()动态构建生成
      //构建流程（JVM做的，可以理解为JVM在执行代理前写了个静态代理类并加载进去）：
      // 1）编写源文件(java文件)——即编写目标类接口interface实现类（方法的实现结合InvocationHandler实现类的invoke()方法的增强和反射调用目标对象的方法共同实现）；详细查看生成的动态代理类源码
      // 2）编译源文件为class文件
      // 3）将class文件加载到JVM中(ClassLoader)
      // 4）将class文件对应的对象进行实例化（反射）
      //清楚了上面4个流程，就明白为何newProxyInstance()中要传下面三个参数了
      // Proxy是JDK中的API类
      // 第一个参数：目标对象的类加载器
      // 第二个参数：目标对象的接口
      // 第二个参数：代理对象的执行处理器
      Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target));
      
      //代理执行
      proxy.saveUser();
      ```

      使用`sun.misc.ProxyGenerator`可以看到代理类的方法实现是调用InvocationHandler的invoke()方法（接口对象和参数传值不同而已，即InvocationHandler的增强会作用于所有的接口），invoke()方法再反射调用被代理类的同名方法。

      如果想对不同的方法使用不用的增强像Spring AOP那样。个人想到可以考虑使用注解，为不同的方法注上不同的注解，在InvocationHandler的invoke()方法中对每种注解添加对应的处理逻辑。（TODO：不知AOP是不是这么实现的，待研究AOP源码）

      ```java
      public final class $Proxy4 extends Proxy implements Proxy4 {
      	...
      	public final void saveUser() throws  {
              try {
                  super.h.invoke(this, m3, (Object[])null);	//m3指saveUser()方法
              } catch (RuntimeException | Error var2) {
                  throw var2;
              } catch (Throwable var3) {
                  throw new UndeclaredThrowableException(var3);
              }
          }
          public final void selectAllUser() throws  {
              try {
                  super.h.invoke(this, m4, (Object[])null); //m4指selectAllUser()方法
              } catch (RuntimeException | Error var2) {
                  throw var2;
              } catch (Throwable var3) {
                  throw new UndeclaredThrowableException(var3);
              }
          }
          ...
      }
      ```

      

    - Cglib (也基于Jdk动态代理)

      使用继承的方式进行代理（目标类是父类，代理类是子类）。没有实现接口的被代理对象只能通过Cglib代理。但是无法通过接口获取对外服务的方法信息应该怎么生成动态代理类呢？Cglib采用继承的方式，代理类继承被代理类的**非 private 的属性、方法**。

      ```java
      Enhancer enhancer = new Enhancer();
      // 设置需要增强的类的类对象
      enhancer.setSuperclass(clazz);
      // 设置回调函数
      enhancer.setCallback(new MyMethodInterceptor());
      // 获取增强之后的代理对象
      Object object = enhancer.create();
      // 然后通过将object强制转换为clazz对象类型，调用方法。
      ```

      动态代理类接口实现

      ```
      public final void selectAllGoods() throws  {
          try {
          	super.h.invoke(this, m6, (Object[])null);
          } catch (RuntimeException | Error var2) {
          	throw var2;
          } catch (Throwable var3) {
          	throw new UndeclaredThrowableException(var3);
          }
      }
      ```

      

    <u>Spring AOP 动态代理同时依赖Jdk动态代理和Cglib动态代理；因为Jdk动态代理用于代理实现接口的被代理类；Cglib动态代理用于代理没有接口的被代理类。</u>

    那么为什么没有接口类的被代理类就没法使用Jdk动态代理呢？因为Jdk动态代理生成代理对象需要获取被代理对象实现的所有接口信息Interface。

    ```java
    Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),	//这一行，没有实现任何接口的类这里数数组为空
                    new MyInvocationHandler(target));
    ```

    

    动态代理相对于静态代理优势：    
    动态代理避免了接口修改的时候造成的代理类的修改；  
    动态代理可以代理大量不同种类的对象，静态代理只能代理一种类型的对象。

代理模式的优点：

- 解耦

代理模式使用案例：  

- Spring AOP

  AOP的静态织入是通过一些工具在class文件被加载的时候对class文件进行修改（修改的就是代理的代码）；

  AOP的动态织入是通过动态代理方式去实现的。

- 拦截器 

### 行为型模式

#### **visitor 访问者模式**

分离不变的数据结构(元素不变)和对元素多变的操作（不同访问者对元素总是有不同的操作），后面有新增的操作就定义一个新的Visitor实现类实现对元素新的操作。

#### **template 模板模式**

业务流程固定，但是业务的每一步有些许变化。

使用案例：

- Spring 中众多的Template, 如：JdbcTemplate、RedisTemplate etc

#### **strategy 策略模式**

有多种处理策略，但是不通过if...else…在调用前选择策略，而是直接一个一个**轮询策略**在策略内判断是否适合，适合则执行处理操作。

使用策略模式可以**仅修改一行**原有代码实现策略拓展。

存储策略集合可以通过**集合类**、**Enum**、**配置文件**(推荐)存储。

使用案例：

- Spring HandlerMapping

  spring请求匹配HandlerMapping的时候是拿到所有HandlerMapping，一个一个地匹配看哪个HandlerMapping可以处理这个请求，然后执行对应的处理（RequestHandler）。

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

#### state 状态模式

#### **observer 观察者模式**

感觉应该说是”通知模式“，因为实现都是“观察者”不主动观察监听，而是告诉“被监听者”说我是你的观察者，

来事了记得通知我处理（被监听者拥有观察者的对象引用，来事就通过此饮用调用处理方法）。

#### memento 备忘录模式

#### mediator 中介者模式

#### iterator 迭代器模式

#### interpreter 解释器模式

#### **command 命令模式**

#### chainOfResponsibility 责任链模式

**特点**:

责任链模式讲的就是将请求的发送者和接收者进行分离，避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止，面对需求变更，只需要更加处理类就好了，而且客户端可以按照自己的需求拼接处理链条。  

(每个处理器是链表的一个节点，所有处理器连成一条链，请求从第一个处理器开始处理(处理器内部决定要不要处理这个请求))。

优点：

+ 解耦了请求与处理；
+ 请求处理者（节点对象）只需关注自己感兴趣的请求进行处理即可，对于不感兴趣的请求，直接转发给下一级节点对象；
+ 具备链式传递处理请求功能，请求发送者无需知晓链路结构，只需等待请求处理结果；
+ 链路结构灵活，可以通过改变链路结构动态地新增或删减责任；
+ 易于扩展新的请求处理类（节点），符合 开闭原则；

缺点：

+ 责任链路过长时，可能对请求传递处理效率有影响；
+ 如果节点对象存在循环引用时，会造成死循环，导致系统崩溃；

使用限制：

被处理的对象的处理模式固定，如果每次来的对象的处理方式经常变就不适合用责任链，不然每次都要添加新的处理器节点，还降低性能。

**使用场景：**

+ Spring MVC Filter/Interceptor，Spring Security 的认证链

+ Mybatis 插件（动态代理实现层层封装，外层处理完传给一下层）

+ Netty Pipeline 的 ChannelHandler 链

+ OA审批

  [使用责任链优化前后对比的案例--采购部采购审批](https://blog.csdn.net/justloveyou_/article/details/68489505)

+ ......

**实现方式：**

这里展示上面场景中源码实现方式。



### 其他模式

#### 委派模式   

接受请求的对象将请求委托给另一个对象来处理。委托模式是一项基本技巧，许多其他的模式，如状态模式、策略模式、访问者模式
本质上是在更特殊的场合采用了委托模式。委托模式使得我们可以用聚合来替代继承。

Spring BeanDefinition解析时用到委托模式。`DefaultBeanDefinitionDocumentReader`解析bean xml配置时
委托给了`BeanDefinitionParserDelegate`。
```java
DefaultBeanDefinitionDocumentReader$doRegisterBeanDefinitions()
  this.delegate = createDelegate(getReaderContext(), root, parent);
  parseBeanDefinitions(root, this.delegate);
    delegate.parseCustomElement(root);  //BeanDefinitionParserDelegate$parseCustomElement()
```

#### MVC模式（架构型设计模式）

#### Cache-Aside 旁路缓存模式

这个其实也被定义为是一种设计模式。之前一直将其看作是一种缓存编码规范了。

这里再总结一下。

**核心**：

失效：应用程序先从cache中取数据，没有得到则从数据库中取数据，成功后，放入到缓存；

命中：应用程序从cache中取数据，取到数据后返回；

更新：先把数据存到数据库中，成功后再让缓存失效（注意是失效，不是更新，后面分析原因）。

**拓展**：

+ Cache-Aside 模式的问题？

  失效分为两个操作：查询数据库、放入缓存；更新也分为两个操作：更新数据库、删除缓存；

  并发场景下，假设有两个操作，一个线程做失效处理（查询缓存缓存为空再查数据库A1，放入缓存A2）一个线程做更新处理（更新数据库B1，删除缓存B2);  有几种情况：A1A2B1B2、A1B1A2B2、A1B1B2A2、B1A1A2B2、B1A1B2A2、B1B2A1A2。

  （其实还有两种情况：两个并发的失效处理、两个并发的更新处理，不过没问题所以没列举）

  其中A1B1B2A2，即一个线程查询缓存发现缓存为空然后去查数据库，但是在写入缓存前，另一个线程完成了更新操作（更新数据库并删除缓存），然后第一个线程写入到缓存的就是旧的数据，会导致数据不一致的问题。

  > 其实这种情况可能发生但是发生概率很小，B1B2发生在A1A2之间说明写操作比读操作还快，这一般**可能性很小**，所以对于一致性要求不是非常高的业务，直接使用Cache-Aside也是可以的。

  如果想要让Cache-Aside模式更可靠些，可以等待一段时间再删除一次（延迟双删），但是这种也同样不能百分百保证一致性。

  比如延迟删除操作，发生在另一对 A3B3B4A4的 B3A4之间。和HTTPS安全一样只能相对变得更加可靠但是不能保证完全可靠。

+ 错误的Cache-Aside模式实现

  看到有网文抄Cache-Aside都抄错的，比如更新：先更新数据库再更新缓存，还有先删除缓存再更新数据库的。

  还按上面的分析流程分析：

  第一种情况的问题：如果两个并发的更新操作，后更新完数据库的线程却先更新缓存，这时会导致数据库和缓存不一致的问题，而且写写操作这种情况出现概率很大，是需要避免的。

  第二中情况的问题：一个线程执行更新处理操作，先删了缓存，另一个线程执行失效处理操作，查询缓存为空又去查询数据库，然后执行存入缓存的操作，然后就导致数据库和缓存不一致问题，出现概率比如前一种情况还大，也需要避免这么操作的。

**其他缓存模式**：

>  参考Oracle的 [一致性开发者指南](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/toc.htm) 第13章节 [Read-Through, Write-Through, Write-Behind, and Refresh-Ahead Caching](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/cache_rtwtwbra.htm#COHDG5177)，不过图好像画的太复杂了。

+ Read/Write Through Pattern

  + Read Through

    当应用程序向缓存请求一个条目时，例如键X，而X还没有在缓存中，Coherence将自动委托给CacheStore，并要求它从底层数据源加载X。如果X存在于数据源中，CacheStore将加载它，将它返回给Coherence，然后Coherence将它放在缓存中以供将来使用，最后将X返回给请求它的应用程序代码。

    ![](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/img/read-through.jpg)

    > JVM1-4可以理解为业务服务的JVM进程，Near Cache是各个服务节点的本地缓存，这个缓存是分片以及主备的，通过CacheLoader加载以及实例初始化。

  + Write Through

    当应用程序更新缓存中的一段数据时(即调用put(…)来更改缓存条目)，直到Coherence已经通过CacheStore并成功地将数据存储到底层数据源，操作才会完成(即put不会返回)。

    ![](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/img/write-through.jpg)

+ Write Behind Pattern 

  对Write Through 写性能做了优化，通过队列存起来异步批量更新。

  ![](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/img/write-behind.jpg)

+ Refresh-Ahead Pattern 

  对 Read Through 读性能做了进一步的优化。

