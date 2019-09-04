package top.kwseeker.pattern.singleton;

/**
 * 完整的双重校验锁懒汉加载模式
 * 使用volatile
 * 1）禁用CPU缓存，指令执行时直接从主内存取，而不是CPU缓存（工作内存）取，同时要求read、load、use作为一个整体，
 *  assign、store、write动作作为一个整体。
 *
 * Java通过几种原子操作完成工作内存和主内存的交互：
 *      lock：作用于主内存，把变量标识为线程独占状态。
 *      unlock：作用于主内存，解除独占状态。
 *      read：作用主内存，把一个变量的值从主内存传输到线程的工作内存。
 *      load：作用于工作内存，把read操作传过来的变量值放入工作内存的变量副本中。
 *      use：作用工作内存，把工作内存当中的一个变量值传给执行引擎。
 *      assign：作用工作内存，把一个从执行引擎接收到的值赋值给工作内存的变量。
 *      store：作用于工作内存的变量，把工作内存的一个变量的值传送到主内存中。
 *      write：作用于主内存的变量，把store操作传来的变量的值放入主内存的变量中。
 */
public class Student6 {

    private volatile static Student6 student6;

    private Student6() {}

    public static Student6 getInstance() {
        if(student6 == null) {
            synchronized (Student6.class) {
                if(student6 == null) {
                    student6 = new Student6();
                }
            }
        }
        return student6;
    }
}
