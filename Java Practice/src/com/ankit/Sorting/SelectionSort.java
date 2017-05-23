package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/23/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {10,1,9,2,8,3,7,4,6,5};
        int t = 0,min=0;
        for (int i = 0; i<a.length;i++)
        {   min=i;
            for (int j = i+1; j<a.length;j++)
                if (a[j] < a[min])
                {
                    min = j;
                }
            t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

        for (int l = 0; l<10;l++)
            System.out.println(a[l]);
    }
}
