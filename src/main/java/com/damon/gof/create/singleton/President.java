package com.damon.gof.create.singleton;

public class President {

    private static volatile President instance = null;

    private President(){}

    public static President getInstance(){
        if (instance == null) {
            synchronized(President.class){
                if (instance == null) {
                    instance = new President();
                }else{
                    System.out.println("已经有了一个总统了2");
                }
            }
        }else{
            System.out.println("已经有了一个总统了1");
        }
        return instance;
    }
}
