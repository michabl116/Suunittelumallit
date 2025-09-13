package Tehtava10;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler nextHandler) {
        this.next = nextHandler;
        return nextHandler;
    }
    public abstract String handle(Message message);
}
