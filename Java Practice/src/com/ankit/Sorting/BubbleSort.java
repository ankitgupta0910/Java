package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/22/17.
 */
public class BubbleSort {
        public static void main(String[] args) {
            int a[] = {10,1,9,2,8,3,7,4,6,5};
            int t = 0;
            for (int i = a.length; i>0;i--)
            {
                for (int j = 0; j<i-1;j++)
                    if (a[j] > a[j+1])
                    {
                        t = a[j];
                        a[j] = a[j+1];
                        a[j+1] = t;
                    }
            }

            for (int l = 0; l<10;l++)
                System.out.println(a[l]);
        }
}
