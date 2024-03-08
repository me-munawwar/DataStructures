package practice.binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import util.Node;

public class LevelOrderTranversal {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.right = new Node(3);

        root.right = new Node(7);
        root.right.right = new Node(8);

        levelOrder(root);

    }

    static ArrayList<Integer> levelOrder(Node node) {
        Queue<Node> que = new LinkedList<>();

        if (node != null) {
            que.offer(node);
        }

        return leverOrderUtil(que, new ArrayList<Integer>());
    }

    private static ArrayList<Integer> leverOrderUtil(Queue<Node> que, ArrayList<Integer> arrayList) {
        while (!que.isEmpty()) {

            Node curr = que.poll();
            arrayList.add(curr.data);
            if (curr.left != null) {
                que.offer(curr.left);
            }

            if (curr.right != null) {
                que.offer(curr.right);
            }
        }
        return arrayList;
    }

}
