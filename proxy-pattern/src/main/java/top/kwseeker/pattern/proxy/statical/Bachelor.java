package top.kwseeker.pattern.proxy.statical;

import top.kwseeker.pattern.proxy.Merry;

public class Bachelor implements Merry {

    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿");
    }

    //@Override
    //public void marry() {
    //    System.out.println("结婚");
    //}
}
