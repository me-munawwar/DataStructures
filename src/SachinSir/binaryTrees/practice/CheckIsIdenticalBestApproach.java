package SachinSir.binaryTrees.practice;

import util.Node;

public class CheckIsIdenticalBestApproach {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        boolean checkIfIdentical = checkIfIdentical(root1, root2);

    }

    private static boolean checkIfIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return root1.data == root2.data && checkIfIdentical(root1.left, root2.left)
                    && checkIfIdentical(root1.right, root2.right);
        } else {
            return false;
        }
    }
}
