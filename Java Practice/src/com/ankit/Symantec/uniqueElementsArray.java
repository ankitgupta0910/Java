package com.ankit.Symantec;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ankitgupta on 6/7/17.
 */
public class uniqueElementsArray {

    public static void main(String[] args) {
        Integer a[] = {1, 2, 2, 3, 4, 4, 4, 5, 6};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i]))
                hm.put(a[i], hm.get(a[i]) + 1);
            else
                hm.put(a[i], 1);
        }

        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() > 1)
                System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
