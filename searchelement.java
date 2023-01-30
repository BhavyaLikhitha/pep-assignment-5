import java.util.*;
class Node<E> {
    E data;
    Node<E> next;
    Node(E data) { this.data = data; }
}

class LinkedList<E> {
    Node<E> head = null;
    int size = 0;
    public void add(E element)
    {
        if (head == null) {
            head = new Node<>(element);
            size++;
            return;
        }
        Node<E> add = new Node<>(element);
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = add;
        size++;
    }
    public int search(E element)
    {

        if (head == null) {
            return -1;
        }

        int index = 0;
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data == element) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
}

public class lib{
    public static void main(String[] args) throws Exception
    {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(12);
        l.add(0);
        l.add(23);
        l.add(2);
        l.add(12);
        int element = 23;
        int ans = l.search(23);

        if (ans == -1) {
            System.out.println(
                    "Element not found in the Linked List");
        }
        else
            System.out.println(
                    "Element found in the Linked List at "
                            + ans);
    }
}
