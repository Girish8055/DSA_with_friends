package shhradha;

import java.util.LinkedList;

public class Linklist_add_middle {



    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Linklist_add_middle.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Linklist_add_middle.Node head;
    public static Linklist_add_middle.Node tail;

    public void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);


        System.out.println(ll);
    }
}
