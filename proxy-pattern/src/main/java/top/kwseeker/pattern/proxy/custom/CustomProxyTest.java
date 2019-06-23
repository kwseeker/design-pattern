package top.kwseeker.pattern.proxy.custom;

import top.kwseeker.pattern.proxy.Merry;
import top.kwseeker.pattern.proxy.jdkDynamic.XieMu;

public class CustomProxyTest {

    public static void main(String[] args) throws Exception{
        Merry merryPerson = new XieMu();
        Merry obj = (Merry) new MyProxyMeipo().getInstance(merryPerson);
        obj.findLove();
        //System.out.println(obj);      //TODO：为何这里打印这个生成的代理类会调用invoke()?
    }
}
