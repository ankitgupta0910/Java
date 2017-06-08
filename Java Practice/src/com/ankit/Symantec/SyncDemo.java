package com.ankit.Symantec;

/**
 * Created by ankitgupta on 6/8/17.
 */

class Count {
    int counter;

    synchronized public void increment() {
        counter++;
    }
}

public class SyncDemo {

    public static void main(String[] args)  throws Exception{

        Count c = new Count();

        Thread t1 = new Thread(() -> {for (int i = 0; i < 1000; i++) c.increment();});

        Thread t2 = new Thread(() -> {for (int i = 0; i < 1000; i++) c.increment();});

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.counter);
    }


}
