import java.util.Stack;

/**
 * Created by ankitgupta on 5/21/17.
 */
public class reverseWordsFromString {

    public static void main(String[] args) {

        String stri = new String("geeks quiz practice code ");
        Stack s = new Stack();
        StringBuilder st = new StringBuilder();
        int leng = stri.length();
        for(int k =0; k<leng; k++)
        {
        while (stri.charAt(k) != ' ' && k<leng)
        {
            s.push(stri.charAt(k));
            k++;
        }
        while (!s.empty())
        {
            st.append(s.pop());
        }
        st.append(' ');
        }
//        System.out.println(st);

        for(int k =leng-2; k>-1; k--)
        {
            System.out.print(st.charAt(k));
        }
    }
}
