package practice.binarySearchTree;

import util.Node;

public class SearchANode {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.left.right = new Node(66);
        root.right.left.right.left = new Node(45);

        root.right.right = new Node(87);
        root.right.right.right = new Node(90);

        boolean searchNode = searchNode(root, 87);

        System.out.println("Search Node Exists : " + searchNode);
    }

    private static boolean searchNode(Node root, int i) {
        if (root == null) {
            return false;
        }

        if (root.data == i) {
            return true;
        }

        return searchNode(root.left, i) || searchNode(root.right, i);
    }
}
