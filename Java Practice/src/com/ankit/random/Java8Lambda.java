package com.ankit.random;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by ankitgupta on 5/28/17.
 */

interface Cons{
    void show();
}

//    class consImpl implements Consumer<Integer>{
//    @Override
//    public void accept(Integer integer) {
//        System.out.println(integer);
//    }
//}

public class Java8Lambda {

    public static void main(String[] args) {

        Cons c = () -> {
                System.out.println("Show");
        };

        c.show();



         }




}
