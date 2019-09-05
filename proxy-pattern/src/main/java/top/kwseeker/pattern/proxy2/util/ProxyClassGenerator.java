package top.kwseeker.pattern.proxy2.util;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 动态代理类class文件生成器
 */
public class ProxyClassGenerator {

    public static void generatorClass(Object proxy) {
        FileOutputStream out = null;
        try {
            // byte[] generateProxyClass =
            // ProxyGenerator.generateProxyClass(proxy.getClass().getName(), new Class[]
            // {proxy.getClass()});
            byte[] generateProxyClass = ProxyGenerator.generateProxyClass(proxy.getClass().getSimpleName(),
                    new Class[] { proxy.getClass() });
            out = new FileOutputStream(proxy.getClass().getSimpleName() + ".class");
            out.write(generateProxyClass);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("error=" + e.getMessage());
                }
            }
        }

    }
}
