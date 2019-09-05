package top.kwseeker.pattern.proxy2.factory;

import net.sf.cglib.proxy.Enhancer;
import top.kwseeker.pattern.proxy2.advice.MyMethodInterceptor;

public class CglibProxyFactory {

    public Object getProxyInstance(Class<?> clazz) {
        // 创建增强器
        Enhancer enhancer = new Enhancer();
        // 设置需要增强的类的类对象
        enhancer.setSuperclass(clazz);
        // 设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        // 获取增强之后的代理对象
        Object object = enhancer.create();

        return object;
    }
}
