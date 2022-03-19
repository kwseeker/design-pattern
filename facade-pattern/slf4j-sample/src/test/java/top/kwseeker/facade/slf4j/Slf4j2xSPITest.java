//package top.kwseeker.facade.slf4j;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.slf4j.ILoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.spi.SLF4JServiceProvider;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ServiceLoader;
//
///**
// * 原理也很简单
// */
//public class Slf4j2xSPITest {
//
//    /**
//     * Slf2.x 日志门面 获取日志工厂（ILoggerFactory）核心原理
//     *
//     * 测试时版本切换到
//     * <slf4j.version>2.0.0-alpha7</slf4j.version>
//     */
//    @Test
//    public void testSPILoadLoggerFactoryProvider() {
//        List<SLF4JServiceProvider> providerList = new ArrayList<>();
//
//        //1) SPI 扫描所有桥接模块jar包的名为“org.slf4j.spi.SLF4JServiceProvider”的SPI service文件 加载 SLF4JServiceProvider
//        ServiceLoader<SLF4JServiceProvider> serviceLoader = ServiceLoader.load(SLF4JServiceProvider.class);
//        for (SLF4JServiceProvider provider : serviceLoader) {
//            providerList.add(provider);
//        }
//        //2）选用第一个加载的 SLF4JServiceProvider 实例
//        SLF4JServiceProvider actualUseProvider = providerList.get(0);
//        //3）初始化，内部会实例化日志框架的日志工厂类（桥接层日志工厂类做过接口适配）
//        actualUseProvider.initialize();
//        //4）实例化后就可以获取到日志工厂
//        ILoggerFactory loggerFactory = actualUseProvider.getLoggerFactory();
//        Assert.assertEquals("org.slf4j.simple.SimpleLoggerFactory", loggerFactory.getClass().getName());
//
//        Logger logger = loggerFactory.getLogger(Slf4j2xSPITest.class.getName());
//        logger.info("test spi load and get logger factory");
//    }
//}
//
