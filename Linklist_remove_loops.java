package shhradha;

public class Linklist_remove_loops {
    // static inner class
    static class Node {
        int value;

        // connect each node to next node
        Linklist_loop.Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static Linklist_loop.Node head;
    public static Linklist_loop.Node tail;

    public static long remove_cycle () {
        // Detect cycle
        Linklist_loop.Node slow = head;
        Linklist_loop.Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if ( cycle == false) {
            return 0;
        }

        //find meeting point
        slow = head;
        Linklist_loop.Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        prev.next= null;

        return 0;
    }


    public static void main(String[] args) {

        head = new Linklist_loop.Node(1);
        head.next = new Linklist_loop.Node(2);
        head.next.next = new Linklist_loop.Node(3);
        head.next .next.next= head;

        System.out.println(remove_cycle());
        remove_cycle();
        System.out.println(remove_cycle());
    }
}
