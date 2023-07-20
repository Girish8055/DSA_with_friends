package shhradha;

public class Linklist_add {

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

    public void addfirst (int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        if(head == null) {
            head= tail = newNode;
            return;
        }
        // step2 newNode next = head
        newNode.next = head;  //link

        //step3 head= newNode
        head = newNode;
    }

    public void addlast (int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Linklist_add ll = new Linklist_add();
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        ll.addlast(6);
        ll.print();

        System.out.println();
    }

}
