package top.kwseeker.facade.slf4j;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Slf4j 1.x StaticLoggerBinder bind 测试
 */
public class Slf4j1xBindTest {

    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";

    /**
     *
     * Slf2.x 日志门面 获取日志工厂（ILoggerFactory）核心原理
     * LogFactory$findPossibleStaticLoggerBinderPathSet()
     *
     * 测试时版本切换到
     * <slf4j.version>1.7.36</slf4j.version>
     */
    @Test
    public void testFindPossibleStaticLoggerBinderPathSet() throws IOException {
        Set<URL> staticLoggerBinderPathSet = new LinkedHashSet<>();

        //1）类加载阶段，加载第一个扫描到的 StaticLoggerBinder class

        //2）这一步其实没太大用，只是当扫到多个StaticLoggerBinder同名实现，发个警告
        ClassLoader loggerFactoryClassLoader = LoggerFactory.class.getClassLoader();
        Enumeration<URL> paths;
        if (loggerFactoryClassLoader == null) {
            System.out.println("loggerFactoryClassLoader: null");
            paths = ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH);
        } else {
            System.out.println("loggerFactoryClassLoader: " + loggerFactoryClassLoader.getClass().getName());
            paths = loggerFactoryClassLoader.getResources(STATIC_LOGGER_BINDER_PATH);
        }

        while (paths.hasMoreElements()) {
            URL path = paths.nextElement();
            staticLoggerBinderPathSet.add(path);

            System.out.println(path.getPath());
        }

        //3）StaticLoggerBinder 实例化，内部会实例化 具体日志框架的ILoggerFactory实现
        //其实类加载阶段，就已经知道实际使用的是哪个 StaticLoggerBinder 了
        StaticLoggerBinder binder = StaticLoggerBinder.getSingleton();

        ILoggerFactory loggerFactory = binder.getLoggerFactory();
        Logger logger = loggerFactory.getLogger(Slf4j1xBindTest.class.getName());

        logger.info("test classloader load and get logger factory");
    }
}
