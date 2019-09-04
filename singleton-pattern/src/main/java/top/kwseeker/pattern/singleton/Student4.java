package top.kwseeker.pattern.singleton;

/**
 * 带缺陷的双重检查锁（DCL）懒汉单例模式
 * 缺陷：student4 = new Student4(); 由三条字节码指令构成，后两条指令没有happened-before关系，可能发生指令重排。
 *  memory = allocate();    //1：分配对象的内存空间
 *  initInstance(memory);   //2：初始化对象
 *  instance = memory;      //3：设置instance指向刚分配的内存地址
 *  可能1-2-3，也可能1-3-2
 */
public class Student4 {

    private static Student4 student4;

    private Student4() {}

    public static Student4 getInstance() {
        if(student4 == null) {
            synchronized (Student4.class) {
                if(student4 == null) {
                    student4 = new Student4();
                }
            }
        }
        return student4;
    }
}
