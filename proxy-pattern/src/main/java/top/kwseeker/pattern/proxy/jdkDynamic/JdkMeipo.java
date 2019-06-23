package top.kwseeker.pattern.proxy.jdkDynamic;

import top.kwseeker.pattern.proxy.Merry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {

    private Merry merryPerson;

    public Object getInstance(Merry merryPerson) throws Exception {
        this.merryPerson = merryPerson;

        Class<?> clazz = merryPerson.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("媒婆：我已经拿到你的需求, 开始物色");
        method.invoke(this.merryPerson, args);
        return null;
    }
}
