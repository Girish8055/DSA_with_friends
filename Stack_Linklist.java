package shhradha;

public class Stack_Linklist  {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isempty() {
            return head == null;
        }

        // push
        public static void push (int data) {
            Node newNode = new Node(data);
            if(isempty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String[] args) {
        StackB.Stack s = new StackB.Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
