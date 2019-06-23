package top.kwseeker.pattern.proxy.custom;


import top.kwseeker.pattern.proxy.Merry;

import java.lang.reflect.Method;

public class MyProxyMeipo implements MyInvocationHandler {

    private Merry target;

    public Object getInstance(Merry target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆：我已经拿到你的需求, 开始物色");
        method.invoke(this.target, args);
        return null;
    }
}
