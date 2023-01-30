import java.io.*;
public class lib
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {data = d;
            next = null; }
    }
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        lib l = new lib();
        l.append(1);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.append(2);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.append(3);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.append(4);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
    }
}
