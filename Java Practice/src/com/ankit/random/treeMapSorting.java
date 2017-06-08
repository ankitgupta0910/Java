package com.ankit.random;

import java.util.*;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class treeMapSorting {


    public static void main(String[] args) {
        Employee e1 = new Employee("Ankit", 101);
        Employee e2 = new Employee("Gagan", 102);
        Employee e3 = new Employee("Jagmohan", 103);
        Employee e4 = new Employee("Rimmy", 104);
        Employee e5 = new Employee("Hardeep", 105);
        Employee e6 = new Employee("Hardeep", 105);
        Employee e7 = new Employee("Hardeep", 105);

        Map<Integer,Employee> hm = new TreeMap<>();
        hm.put(5,e1);
        hm.put(4,e5);
        hm.put(3,e4);
        hm.put(2,e3);
        hm.put(1,e2);

        List<Employee> peopleByAge = new ArrayList<Employee>(hm.values());
////        Employee ew =
//                peopleByAge.stream()
////                        .min((ea,eb) -> Integer.compare(ea.getId(),eb.getId())).get();
//                      .filter(p -> p.getName().startsWith("A"))
//                      .forEach(p -> System.out.println(p.getName()));
//        System.out.println(ew.getName());

        Comparator<Employee> nameComp = (Employee o1, Employee o2) ->{
                return o1.getName().compareTo(o2.getName());
        };

        Collections.sort(peopleByAge, nameComp);
        for(Employee e : peopleByAge)
            System.out.println(e.getName());

//        Map<Employee,Integer> hm1 = new HashMap<>();
//        hm1.put(e5,1);
//        hm1.put(e6,1);
//        hm1.put(e7,1);
//        System.out.println(hm1.size());
    }
    }