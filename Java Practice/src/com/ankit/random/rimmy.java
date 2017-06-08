package com.ankit.random;

/**
 * Created by ankitgupta on 5/30/17.
 */

public class rimmy {

    void x(String a)
    {
        System.out.println(a);
    }

    void x(StringBuilder a)
    {
        System.out.println("Sb" + a);
    }

    void x(Object a)
    {
        System.out.println("Object" + a);
    }

    public static void main(String[] args) {
//        List<>
        rimmy r = new rimmy();
//        StringBuilder sb = new StringBuilder("Ank");
        r.x("Ankit");
        r.x(r);
       // r.x(null);
        //r.x(sb);
    }

}
