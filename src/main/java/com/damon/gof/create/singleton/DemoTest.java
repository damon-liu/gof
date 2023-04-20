package com.damon.gof.create.singleton;

public class DemoTest {

    public void A(){
        System.out.println("1111111");
    }

    public DemoTest(){
        System.out.println("2222222");
    }

    public static void main(String[] args) {
//        A a = new A();
////        a.A();
////
////        LazySingleton lazySingleton1 = LazySingleton.getInstance();
////        LazySingleton lazySingleton2 = LazySingleton.getInstance();
////        System.out.println(lazySingleton1 == lazySingleton2);

        President president1 = President.getInstance();
        President president2 = President.getInstance();
        System.out.println(president1==president2);
    }

}
