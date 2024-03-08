package SachinSir.binaryTrees.practice;

import java.util.ArrayList;
import java.util.Arrays;

import util.Node;

public class CheckBalanceBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(10);
        root.left.left = new Node(5);
        root.right = new Node(39);

        isBalance(root);
    }

    private static void isBalance(Node root) {
        Height height = new Height();

        isBalancedUtil(root, height);
    }

    private static boolean isBalancedUtil(Node root, Height height) {

        if (root == null) {
            height.h = 0;
            return true;
        }
        // Get the height of left and right sub-trees
        Height lh = new Height();
        Height rh = new Height();

        boolean leftH = isBalancedUtil(root.left, lh);
        boolean rightH = isBalancedUtil(root.right, rh);

        int l = lh.h;
        int r = rh.h;
        height.h = Math.max(l, r) + 1;

        if (Math.abs(l - r) > 1) {
            return false;
        } else {
            return leftH && rightH;
        }
    }

}

class Height {
    int h;
}
