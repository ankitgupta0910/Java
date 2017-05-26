package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/24/17.
 */
public class QuickSort {


    public int partition(int[] A, int start, int end){
        int t = 0;
        int pivot = A[end];
        int pIndex = start;
        for(int i = start; i<=end-1; i++)
        {
             if(A[i] <= pivot)
             {
                 t = A[i];
                 A[i] = A[pIndex];
                 A[i] = t;
                 pIndex +=  1;
             }
        }
        t = A[end];
        A[end] = A[pIndex];
        A[pIndex] = t;
        return pIndex;
    }

    public void qsort(int[] A, int start, int end){

        if(start<end)
        {
            int pIndex = partition(A,start,end);
            qsort(A,start,pIndex-1);
            qsort(A,pIndex+1, end);
        }
    }

    public static void main(String[] args) {
        int A[] = {10,9,8,7,6,5,4,3,2,1};
        QuickSort qs = new QuickSort();
        qs.qsort(A,0,A.length-1);
        for(int i = 0; i<A.length; i++)
            System.out.println(A[i]);
    }
}
