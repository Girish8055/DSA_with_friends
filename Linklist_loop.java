package shhradha;
import java.util.LinkedList;
public class Linklist_loop {


    // static inner class
    static class Node {
        int value;

        // connect each node to next node
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static Linklist_loop.Node head;
    public static Linklist_loop.Node tail;

    public static boolean iscycle () {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // loop/cycle exist
            }
        }
        return false; // loop does not exist
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next .next.next= head;

        System.out.println(iscycle());
    }
}
