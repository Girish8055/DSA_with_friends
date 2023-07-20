package shhradha;

import java.util.LinkedList;

public class Linkedlist_removeElement {

    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void deleteNthElementfromEnd (int n) {

        //calculating size
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        // remove first element
        if(n == size) {
            head = head.next;
            return;
        }

        //remove size-n
        int i = 1;
        int itofind = size-n;
        Node prev = head;
        while(i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll);
       // ll.deleteNthElementfromEnd(3);

    }
}
