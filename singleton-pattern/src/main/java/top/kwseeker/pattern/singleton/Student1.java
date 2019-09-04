package top.kwseeker.pattern.singleton;

/**
 * 最基本饿汉单例模式
 * 不存在线程安全问题因为线程使用它时它早就创建好了
 * 但是可能浪费内存空间(某些场景可能根据场景选择单例对象，某些可能整个应用生命周期都不会被用到)
 */
public class Student1 {

    private static Student1 student1 = new Student1();

    private Student1() {}

    public static Student1 getInstance() {
        return student1;
    }
}
