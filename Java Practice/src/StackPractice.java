/**
 * Created by ankitgupta on 5/6/17.
 */
class Node{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }

    Node getNext()
    {
        return this.next;
    }

    int getData()
    {
        return this.data;
    }

    void setNext(Node ne)
    {
        this.next = ne;
    }
}
public class StackPractice {
    Node head, temp;

    StackPractice()
    {
        head = null;
    }

    void insert(int data)
    {
        Node n = new Node(data);
        if (head == null)
        {
            head = n;
        }
        else
        {
            temp = head;
            while(temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNext(n);
        }
    }

    void traverse()
    {
        Node temp;
        temp = head;
        while(temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args)
    {
        StackPractice s = new StackPractice();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.insert(40);
        s.insert(50);
        s.traverse();
    }
}


