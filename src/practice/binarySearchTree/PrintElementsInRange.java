package practice.binarySearchTree;

import java.util.ArrayList;

import util.Node;

public class PrintElementsInRange {

    public static void main(String[] args) {
        Node root = new Node(17);

        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(9);

        root.right = new Node(18);

        ArrayList<Integer> nearNodes = printNearNodes(root, 4, 24, new ArrayList<Integer>());
        System.out.println(nearNodes);
    }

    private static ArrayList<Integer> printNearNodes(Node root, int low, int high, ArrayList<Integer> nearNodes) {
        if (root == null) {
            return nearNodes;
        }

        if (root.data >= low) {
            printNearNodes(root.left, low, high, nearNodes);
        }

        if (root.data >= low && root.data <= high) {
            nearNodes.add(root.data);
        }

        if (root.data <= high) {
            printNearNodes(root.right, low, high, nearNodes);
        }

        return nearNodes;

    }
}
