package shhradha;

import java.util.Stack;

public class Stack_next_Greater_Element {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i= arr.length-1; i>=0; i--) {

            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }

            //3 push in stack
            s.push(i);
        }

        for (int i=0; i<nextGreater.length; i++) {
            System.out.println(nextGreater[i] +" ");
        }
        System.out.println();
    }
}
