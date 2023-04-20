package com.damon.gof.behavior.responsibility.handler1.handler;

public abstract class Handler {

    protected Handler successor = null;

    protected abstract void doHandle();

    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
