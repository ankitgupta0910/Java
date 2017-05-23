package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/23/17.
 */
public class MergeSort {

    public void merge(int[] l,int[] r,int[] n)
    {
//        int[] m = new int[l.length+r.length];
        int i=0,j=0;
        for(int k = 0;k<n.length;k++)
        {
            if(i<l.length){
                if(j<r.length)
                {
                    if(l[i]<r[j])
                    {
                        n[k] = l[i];
                        i++;
                    }
                    else
                    {
                        n[k] = r[j];
                        j++;
                    }
                }
                else
                {
                    n[k] = l[i];
                    i++;
                }
            }
            else
            {
                n[k] = r[j];
                j++;
            }
        }

//        for(int k = 0;k<m.length;k++) {
//            System.out.println(m[k]);
//        }
//        return m;
    }

    public void msort(int[] n)
    {
        if(n.length<2)
            return;
        int mid = n.length/2;
        int l[] = new int[mid];
        int r[] = new int[n.length-mid];
        for(int i=0;i<mid;i++)
            l[i] = n[i];
        for(int i=mid;i<n.length;i++)
            r[i-mid] = n[i];
        msort(l);
        msort(r);
        merge(l,r,n);
    }

    public static void main(String[] args) {
        int a[] = {10,9,8,7,6,11,454,121,5,4,3,2,1};
        MergeSort ms = new MergeSort();
        ms.msort(a);
        for(int k = 0;k<a.length;k++) {
            System.out.println(a[k]);
        }
    }

}
