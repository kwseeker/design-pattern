package top.kwseeker.pattern.proxy2.factory;

import top.kwseeker.pattern.proxy2.advice.MyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * 用于获取代理实例的工厂
 */
public class JdkProxyFactory {

    //被代理对象
    private Object target;

    public JdkProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //返回Object对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target));
    }

    public Object getProxyInstanceNotUseProxy() {

        return null;
    }
}
