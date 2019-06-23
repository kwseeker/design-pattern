package top.kwseeker.pattern.chainofresponsibility;

public class ChainOfResponsibilityPatternTest {

    public static void main(String[] args) {
        Request request = new Request();

        //创建处理器节点并练成一条链,最好在添加一个Head和Tail引用，方便定位处理入口和插入新的处理器
        ConcreteHandler handler1 = new ConcreteHandler();
        ConcreteHandler handler2 = new ConcreteHandler();
        handler1.setNextHandler(handler2);
        ConcreteHandler handler3 = new ConcreteHandler();
        handler2.setNextHandler(handler3);

        //请求链式处理
        handler1.handleRequest(request);
    }
}
