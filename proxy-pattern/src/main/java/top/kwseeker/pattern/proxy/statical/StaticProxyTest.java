package top.kwseeker.pattern.proxy.statical;

import top.kwseeker.pattern.proxy.Merry;

public class StaticProxyTest {

    public static void main(String[] args) {
        Merry merryPerson = new Bachelor();
        Meipo meipo = new Meipo(merryPerson);

        meipo.findLove();
        //meipo.marry();
    }
}
