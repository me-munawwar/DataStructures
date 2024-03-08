package practice.binarySearchTree;

import util.Node;

public class CheckBST {
    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(30);
        root.left.right = new Node(35);
        root.right = new Node(80);
        root.right.right = new Node(100);

        checkBST(root);
    }

    private static boolean checkBST(Node root) {
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;

        boolean checkBSTUtil = checkBSTUtil(root, low, high);
        System.out.println(checkBSTUtil);
        return checkBSTUtil;
    }

    private static boolean checkBSTUtil(Node root, int low, int high) {
        if (root == null) {
            return true;
        }

        return root.data > low && root.data < high && checkBSTUtil(root.left, low, root.data)
                && checkBSTUtil(root.right, root.data, high);
    }
}
