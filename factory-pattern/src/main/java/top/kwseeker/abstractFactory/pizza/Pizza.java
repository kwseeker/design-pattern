package top.kwseeker.abstractFactory.pizza;

public abstract class Pizza {

    protected String name;

    //变化部分
    public abstract void prepare();

    //不变部分,假设所有的 烤切包装 都是一样的
    public void bake() {
        System.out.println("baking");
    }

    public void cut() {
        System.out.println("cutting");
    }

    public void box() {
        System.out.println("boxing");
    }


    public void setName(String name) {
        this.name = name;
    }
}
