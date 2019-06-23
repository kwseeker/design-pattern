package top.kwseeker.pattern.proxy.statical;

import top.kwseeker.pattern.proxy.Merry;

public class Meipo implements Merry {

    private Merry merryPerson;

    public Meipo(Merry merryPerson) {
        this.merryPerson = merryPerson;
    }

    @Override
    public void findLove() {
        this.merryPerson.findLove();
    }

    //被代理类业务拓展之后，代理类也要修改代码
    //@Override
    //public void marry() {
    //    this.merryPerson.marry();
    //}
}
