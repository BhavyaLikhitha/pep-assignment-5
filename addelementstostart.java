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
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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
        l.push(1);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.push(2);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.push(3);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
        l.push(4);
        System.out.print("\nAdding nodes to start of the list is:");
        l.printList();
    }
}
