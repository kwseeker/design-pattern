package top.kwseeker.pattern.proxy.jdkDynamic;

import sun.misc.ProxyGenerator;
import top.kwseeker.pattern.proxy.Merry;

import java.io.FileOutputStream;

public class JdkProxyTest {

    public static void main(String[] args) {
        try {
            //字节码重组
            //1 拿到被代理对象的引用，并且反射获取它的所有接口
            //2 JDK Proxy 重新生成一个新的类，同时新的类要实现被代理类所有实现方法
            //3 动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用
            //4 重新编译新生成的Java代码.class （com.sun.proxy.$Proxy0 这个是运行时动态生成的，可以通过反编译工具查看代码）
            //5 再重新加载到JVM中运行
            Merry merryPerson = new XieMu();
            Merry obj = (Merry) new JdkMeipo().getInstance(merryPerson);
            obj.findLove();
            //System.out.println(obj);      //TODO：为何这里打印这个生成的代理类会调用invoke()?

            //使用反编译工具生成代理代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Merry.class});
            FileOutputStream os = new FileOutputStream("./$Proxy0.class");
            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
