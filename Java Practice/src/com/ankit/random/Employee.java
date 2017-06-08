package com.ankit.random;

import java.util.Comparator;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class Employee implements Comparable<Employee>{

    String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o){
        System.out.println("Equals");
//        if(o != null && o instanceof Employee)
//        {
//            int id = ((Employee)o).getId();
//            String name = ((Employee)o).getName();
//            if(id != 0 && name != null && id == this.getId() && name.equals(this.getName()))
//            {
//                return true;
//            }

//        }
        return false;
    }

    public int hashCode(){
        System.out.println("Hashcode");
//        System.out.println("Hash" + this.name.hashCode() +this.id);
//        return this.name.hashCode() + this.id;
            return 1;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}
