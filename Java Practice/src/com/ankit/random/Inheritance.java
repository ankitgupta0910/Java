package com.ankit.random;

/**
 * Created by ankitgupta on 5/25/17.
 */

class Dog implements Animal{
    @Override
    public String voice() {
        return "Bow Bow";
    }
}

class Cat implements Animal{
    @Override
    public String voice() {
        return "Meow Meow";
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Animal d = new Dog();
        Animal c = new Cat();

        System.out.println(d.voice());
        System.out.println(c.voice());
    }


}
