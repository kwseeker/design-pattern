package top.kwseeker.pattern.singleton;

/**
 * 静态内部类实现单例（类似懒汉式）
 * 使用了静态内部类被调用时加载的特性。
 *
 * 类的加载时机：（并没有规定类何时被加载不同虚拟机也可能实现不一样，但是遇到下面5种初始化情况一定是已经加载了）
 *
 *  虚拟机规范则是严格规定了有且只有 5 种情况必须立即对类进行“初始化”（而加载、验证、
 *  准备自然需要在此之前开始）：
 *  1） 遇到 new、 getstatic、 putstatic 或 invokestatic 这 4 条字节码指令时，如果类没有
 *      进行过初始化，则需要先触发其初始化。
 *  2） 使用 java.lang.reflect 包的方法对类进行反射调用的时候，如果类没有进行过初始
 *      化，则需要先触发其初始化。
 *  3） 当初始化一个类的时候，如果发现其父类还没有进行过初始化，则需要先触发其父类
 *      的初始化。
 *  4） 当虚拟机启动时，用户需要指定一个要执行的主类（包含 main() 方法的那个类），
 *      虚拟机会先初始化这个主类。
 *  5） 当使用 JDK1.7 的动态语言支持时，如果一个 java.lang.invoke.MethodHandle 实例
 *      最后的解析结果 REF_getStatic、 REF_putStatic、 REF_invokeStatic 的方法句柄，并且
 *      这个方法句柄所对应的类没有进行过初始化，则需要先触发其初始化。
 *
 * 而且类加载的时候JVM对还在类的线程会加锁，即类加载的时候线程是安全的。
 */
public class Student5 {

    private Student5() {}

    public static Student5 getInstance() {
        return Student5.SingletonFactory.student;
    }

    private static class SingletonFactory {
        private static Student5 student = new Student5();

        private SingletonFactory() {
        }
    }
}

