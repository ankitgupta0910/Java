package com.ankit.random;

import static java.lang.System.*;

/**
 *
 * Created by ankitgupta on 5/21/17.
 */
public interface Event {

    int a = 5;

    public void setEventName(String name);
    public void setEventPlace(String name);
    static void show(){
        out.println("Event show");
    }
}




