package SachinSir.binaryTrees;

import java.util.PriorityQueue;
import java.util.Queue;

public class BreathFirstSearch {
    public static void main(String[] args) {

        printElementAtEveryOrder(new Node());
    }

    private static void printElementAtEveryOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new PriorityQueue();
        q.add(root);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
            if (root.left != null) {
                q.add(root.left);
            }

            if (root.right != null) {
                q.add(root.right);
            }

        }

    }
}
