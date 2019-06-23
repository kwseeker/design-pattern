package top.kwseeker.pattern.proxy.cglibDynamic;

import top.kwseeker.pattern.proxy.Merry;

public class CglibProxyTest {

    public static void main(String[] args) {
        try {
            Merry object = (Merry) new CglibMeipo().getInstance(ZhangSan.class);
            //System.out.println(object);
            object.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
