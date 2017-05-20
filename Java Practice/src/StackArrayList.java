import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by ankitgupta on 5/20/17.
 */

public class StackArrayList {

   ArrayList<Integer> stackArray = new ArrayList<Integer>();
    int index = -1;
   void insert(int data)
   {
       stackArray.add(data);
       index += 1;
   }

   void remove()
   {
       stackArray.remove(index);
        index -= 1;
   }

   void traverse()
   {
       for (int i = index; i >= 0; i--)
       {
           System.out.println(stackArray.get(i));
       }
   }

    public static void main(String[] args)
    {
        StackArrayList sal = new StackArrayList();
        sal.insert(10);
        sal.insert(20);
        sal.insert(30);
        sal.insert(40);
        sal.insert(50);
        sal.remove();
        sal.traverse();
    }
}
