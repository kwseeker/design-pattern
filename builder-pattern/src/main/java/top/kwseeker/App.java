package top.kwseeker;

import top.kwseeker.builder.MacBuilder;
import top.kwseeker.builder.XiaomiBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        IComputerBuilder builder;
        Director director = new Director();

        builder= new MacBuilder();
        Computor computor1 = director.constructComputer(builder);
        System.out.println("Mac电脑信息：\n" + computor1.introduction());

        builder = new XiaomiBuilder();
        Computor computor2 = director.constructComputer(builder);
        System.out.println("小米电脑信息：\n" + computor2.introduction());
    }
}
