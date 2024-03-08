package practice.binarySearchTree;

import util.Node;

public class AbsoluteMinDifference {

    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(1);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);

        root.right = new Node(9);
        root.right.right = new Node(10);

        int res = minDiff(root, 11);

        System.out.println(res);
    }

    static int minDiff(Node root, int K) {
        if (root == null || K <= 0)
            return -1; // Invalid input

        int abs = Math.abs(K - root.data);
        minDiff = Math.min(minDiff, abs);

        minDiff(root.left, K);
        minDiff(root.right, K);

        return minDiff;
    }
}
