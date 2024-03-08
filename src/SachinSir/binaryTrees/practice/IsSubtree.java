package SachinSir.binaryTrees.practice;

import util.Node;

public class IsSubtree {
    public static void main(String[] args) {
        Node t = new Node(1);
        t.left = new Node(2);
        t.right = new Node(3);
        t.right.left = new Node(4);

        Node s = new Node(3);
        s.left = new Node(4);

        isSubtree(t, s);
    }

    private static boolean isSubtree(Node t, Node s) {
        if (t == null) {
            return false;
        }

        if (isSameTree(t, s)) {
            return true;
        }

        return isSubtree(t.left, s) || isSubtree(t.right, s);
    }

    private static boolean isSameTree(Node t, Node s) {
        if (t == null && s == null) {
            return true;
        } else if (t == null || s == null) {
            return false;
        } else {
            return t.data == s.data && isSameTree(t.left, s.left) && isSameTree(t.right, s.right);
        }
    }
}
