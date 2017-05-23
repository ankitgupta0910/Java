package com.ankit.random;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class isDigit {

    public static void main(String[] args) {
        String s = new String("1312331525");

        int len = s.length();


        Map<Character,Integer> hm= new HashMap<Character, Integer>();
        for (int i=0; i<len; i++)
        {
            if (!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),0);
            }
        }

        for (Character key : hm.keySet()) {
            System.out.println(key);
        }
        //        int sum = 0;
//        for (int i=0; i<len; i++)
//        {
//            if (Character.isDigit(s.charAt(i)))
//            {
//                sum = sum + Character.getNumericValue(s.charAt(i));
//            }
//        }
//        System.out.println(sum);
    }


}
