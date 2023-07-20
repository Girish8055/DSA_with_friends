package shhradha;

public class Binary_Trees_preorder {

    static class Node {
        int data;
        Node left;
        Node right;

    Node (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    }

    public static void preorder (Node root) {

        if (root == null)  {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
      //  tree.preorder(root);
    }
}
