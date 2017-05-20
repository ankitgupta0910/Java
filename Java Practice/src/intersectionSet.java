import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by ankitgupta on 5/19/17.
 */
public class intersectionSet {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<Integer> set1=new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2=new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(5);
        set2.add(6);
        set1.retainAll(set2);
        //Traversing elements
        Iterator<Integer> itr=set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
