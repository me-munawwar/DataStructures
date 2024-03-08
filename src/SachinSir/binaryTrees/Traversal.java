package SachinSir.binaryTrees;

public class Traversal {
    public static void main(String[] args) {
        preOrderTraverse(new Node());
        inOrderTraversal(new Node());
        postOrderTraversal(new Node());
    }

    private static void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.Data);
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }
    // 918274365

    private static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.left);
            System.out.println(root.Data);
            inOrderTraversal(root.right);
            System.out.println(root.Data);
        }
    }
    // 817293645

    private static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.Data);
        }
    }
    // 872163549
}
