package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/23/17.
 */
public class InsertionSort {public static void main(String[] args) {
    int a[] = {10,1,9,2,8,3,7,4,6,5};
    int t = 0;
    for (int i = 1; i<a.length;i++)
    {
        for (int j = i; j>0;j--)
            if (a[j] < a[j-1])
            {
                t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
    }

    for (int l = 0; l<10;l++)
        System.out.println(a[l]);
}
}
