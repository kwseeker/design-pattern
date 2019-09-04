package top.kwseeker.pattern.singleton;

/**
 * 同步锁懒汉单例模式
 * 锁的太重了：可能因为这个getInstance方法业务太简单了感觉有多重，但是如果进入方法到创建对象有很耗时的业务那么就无法忍受了
 */
public class Student3 {

    private static Student3 student3;

    private Student3() {}

    public synchronized static Student3 getInstance() {
        if(student3 == null) {
            student3 = new Student3();
        }
        return student3;
    }
}
