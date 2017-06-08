package com.ankit.random;

/**
 * Created by ankitgupta on 5/26/17.
 */

class Test2{
    public Test2() {
        System.out.println("Hello Test2");
    }
}

class Test1 extends Test2{
    public Test1() {
//        this();
        System.out.println("hello");

    }


//    public Test1(int n){
//        this();
//        System.out.println("hello" + n);
//    }
}



public class Test {
    public static void main(String[] args) {
        Test1 t = new Test1();
    }
}
