package top.kwseeker.pattern.chainofresponsibility;

public abstract class Handler {

    //下一个处理器
    private Handler nextHandler;

    //处理方法
    public abstract void handleRequest(Request request);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

