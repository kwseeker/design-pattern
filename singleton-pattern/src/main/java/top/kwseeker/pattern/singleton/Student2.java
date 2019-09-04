package top.kwseeker.pattern.singleton;

/**
 * 最基本的懒汉单例模式
 * 线程不安全
 * 但是如果Student的实现固定（内部没有记录状态的值随着程序执行在不断改变）的话使用这种应该也是没有问题的。
 */
public class Student2 {

    private static Student2 student2;

    private Student2() {}

    public static Student2 getInstance() {
        if(student2 == null) {
            student2 = new Student2();
        }
        return student2;
    }
}
