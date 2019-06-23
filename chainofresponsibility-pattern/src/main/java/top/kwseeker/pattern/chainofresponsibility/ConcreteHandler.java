package top.kwseeker.pattern.chainofresponsibility;

public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println(this.toString() + "处理器处理");
        if (getNextHandler() != null){          //判断是否存在下一个处理器
            getNextHandler().handleRequest(request);   //存在则调用下一个处理器
        }
    }
}
