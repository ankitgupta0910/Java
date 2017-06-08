package com.ankit.Symantec;

/**
 * Created by ankitgupta on 6/8/17.
 */

class Q {
    int count = 0;
    boolean setValue = false;

    public synchronized void getCount() {
        while (!setValue)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Consumer" + count);
        setValue = false;
        notify();
    }

    public synchronized void setCount() {
        while (setValue)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        count++;
        System.out.println("Producer" + count);
        setValue = true;
        notify();
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.setCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.getCount();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
    }
}
