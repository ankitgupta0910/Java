package com.ankit.Sorting;

/**
 * Created by ankitgupta on 5/23/17.
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        int l[] = {1,2,2,2,4,6};
        int r[] = {3,5,7,8,8,8};
        int[] m = new int[l.length+r.length];
        int i=0,j=0;
        for(int k = 0;k<m.length;k++)
        {
            if(i<l.length){
                if(j<r.length)
                {
                    if(l[i]<r[j])
                    {
                        m[k] = l[i];
                        i++;
                    }
                    else
                    {
                        m[k] = r[j];
                        j++;
                    }
                }
                else
                {
                    m[k] = l[i];
                    i++;
                }
            }
            else
            {
                m[k] = r[j];
                j++;
            }
        }

        for(int k = 0;k<m.length;k++) {
            System.out.println(m[k]);
        }
    }
}
