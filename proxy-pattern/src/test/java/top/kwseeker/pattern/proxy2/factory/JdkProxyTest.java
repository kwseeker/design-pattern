package top.kwseeker.pattern.proxy2.factory;


import org.junit.Test;
import top.kwseeker.pattern.proxy2.target.GoodsService;
import top.kwseeker.pattern.proxy2.target.UserService;
import top.kwseeker.pattern.proxy2.target.UserServiceImpl;
import top.kwseeker.pattern.proxy2.util.ProxyClassGenerator;

public class JdkProxyTest {

    @Test
    public void JdkProxyTest() {
        // 被代理对象, Spring中一般只有一个
        UserService userService = new UserServiceImpl();
        // 通过工厂创建代理对象
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(userService);
        // 创建代理对象, 创建代理对象需要被代理对象的实例
        //      通过被代理对象可以获取要生成的代理类的信息，主要是方法（包括传参和返回）
        //      JVM运行时通过上面拿到的类信息创建代理类，方法实现是反射调用被代理对象的同名方法,但是有InvocationHandler定义增强
        //      InvocationHandler实现类实现的增强功能对所有的方法都进行了增强
        //      加载代理类并实例化
        UserService proxy = (UserService) jdkProxyFactory.getProxyInstance();
        // 生成代理对象的class文件
        ProxyClassGenerator.generatorClass(proxy);
        // 通过代理对象调用
        proxy.saveUser();
        proxy.selectAllUser();
        // 测试继承自Object的public方法会不会被增强（会）
        System.out.println(proxy.toString());
    }

    @Test
    public void CglibProxyTest() {
        GoodsService goodsService = new GoodsService();
        // 生成代理对象
        CglibProxyFactory proxyFactory = new CglibProxyFactory();
        GoodsService proxy = (GoodsService) proxyFactory.getProxyInstance(goodsService.getClass());
        // 生成代理对象的class文件
        ProxyClassGenerator.generatorClass(proxy);
        // 调用代理对象的方法
        proxy.selectAllGoods();
        System.out.println(proxy.toString());
    }
}