package com.ankit.random;

/**
 * Created by ankitgupta on 5/21/17.
 */
//public class A {
//
//    public void hello(){
//        try {
//            System.out.println(10/0);
//        }catch (ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Hello");
//        }
//
//    }
//}



class E{
    static String str = "Ankit";


}



class D extends E{
    static String str = "Rimmy";


}



public class A{
    public static void main(String[] args) {
//        D d = new D();
        System.out.println(D.str);
        System.out.println(E.str);
    }
}