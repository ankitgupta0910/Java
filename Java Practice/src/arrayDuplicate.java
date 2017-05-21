/**
 * Created by ankitgupta on 5/20/17.
 */
public class arrayDuplicate {

    public static void main(String[] args){
        int a[] = {1,2,3,4,5,5,4,3,2,1};
        for (int i = 0; i < 10; i++)
        {
            for (int j = i+1; j < 10; j++)
            {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
        System.out.println("No duplicate");
    }
}
