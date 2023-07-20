package shhradha;
import java.util.*;
//import java.util.LinkedList;
//

public class Binary_Trees_postorder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree2 {
        static int idx = -1;

        public static Binary_Trees.Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Binary_Trees.Node newNode = new Binary_Trees.Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }


        public static void postorder(Node root) {

            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data + " ");
        }

        // Level Order Traversal

        public  static void levelorder (Node root) {
            if(root == null) {
                return;
            }
          //  Queue<Node> q = new LinkedList<>();
        }
    }



        public static void main(String[] args) {

    }
}
