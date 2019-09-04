package top.kwseeker.pattern.singleton;

/**
 * 完整的双重校验锁懒汉加载模式
 *
 * 使用volatile的两个作用
 * 1）禁用CPU缓存，指令执行时直接从主内存取，而不是CPU缓存（工作内存）取，同时要求read、load、use作为一个整体（绑定读操作），
 *  assign、store、write动作作为一个整体（绑定写操作）如果有两个线程一个对volatile变量读，一个对其写，则写在前读在后。
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
 *
 * 2) 禁止指令重排序
 *      不存在happened-before关系的指令码可能发生指令重排序。
 *      happened-before规则（前一个操作的结果对后一个操作可见）：
 *
 *      程序顺序原则：一个线程内保证语义的串行化：a=1；b=a+1；
 *      volatile规则：volatile变量的写，先发生于读，这保证了volatile变量的可见性。
 *      锁规则：解锁（unlock）必然发生在随后的加锁（lock）前
 *      传递性：A先于B，B先于C，那么A必然先于C
 *      线程的start()方法先于他的每一个动作
 *      线程的所有操作先于线程的终结（Thread.join()）
 *      线程的中断（interrupt()）先于被中断线程的代码
 *      对象的构造函数执行结束先于finalize()方法
 */
public class Student6 {

    private volatile static Student6 student6;

    private Student6() {}

    public static Student6 getInstance() {
        if(student6 == null) {
            synchronized (Student6.class) {
                if(student6 == null) {
                    student6 = new Student6();  //不加volatile这里可能发生指令重排序（先分配空间然后赋值再初始化），可能返回一个null
                }
            }
        }
        return student6;
    }
}
