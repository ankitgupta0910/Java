package com.ankit.Symantec;

import com.ankit.random.Test;

/**
 * Created by ankitgupta on 6/7/17.
 */

class TestFibonacci {
    static int n1=0,n2=1,n3=0;

    public static void recursiveFibonacci(int count) {
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            recursiveFibonacci(count-1);
        }
    }

    public static void iterativeFibonacci(int count) {
        for(int i = 0;i<count-2;i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }
    }
}

public class Fibonnaci {

    public static void main(String[] args) {
//        System.out.print(TestFibonacci.n1 +  " " + TestFibonacci.n2);
//        TestFibonacci.recursiveFibonacci(5);
        System.out.print(TestFibonacci.n1 +  " " + TestFibonacci.n2);
        TestFibonacci.iterativeFibonacci(10);
    }
}
