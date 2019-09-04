package top.kwseeker.pattern.singleton;

/**
 * 带缺陷的双重检查锁（DCL）懒汉单例模式
 * 缺陷：由于线程执行指令默认需要先从主内存拷贝拷贝参数到CPU缓存，然后将参数从CPU缓存加载到寄存器进行执行处理；
 *  两个线程的CPU缓存空间是相互不可见的
 *  如果有个线程正在执行将某个值+1操作，但是还没有写回主内存的时候来了第二个线程仍做加1的操作，那么它取的值还是旧的值，
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
