import java.io.*;
class lib {
    Node head;

    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void deleteNode(int position)
    {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next
                = next;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        lib l = new lib();
        l.push(7);
        l.push(1);
        l.push(3);
        l.push(2);
        l.push(8);
        l.deleteNode(1);
        l.printList();
    }
}
