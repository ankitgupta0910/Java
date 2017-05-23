package com.ankit.random;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class A {

    public void hello(){
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Hello");
        }

    }
}