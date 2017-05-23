/**
 * Created by ankitgupta on 5/22/17.
 */
public class rearrangeArray {

    public static void main(String[] args) {
        int a[] = {10,1,9,2,8,3,7,4,6,5};
        int k = 5;
        int t = 0;

        for (int i = 0; i<a.length;i++)
            {
                for (int j = i+1; j<a.length;j++)
                if (a[i] > a[j])
                {
                      t = a[i];
                      a[i] = a[j];
                      a[j] = t;
                }
            }

        for (int l = 0; l<10;l++)
            System.out.println(a[l]);
    }
}
