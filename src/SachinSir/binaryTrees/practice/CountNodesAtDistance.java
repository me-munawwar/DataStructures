package SachinSir.binaryTrees.practice;

import java.util.Arrays;

import util.BinaryTree;
import util.Node;

public class CountNodesAtDistance {
    static int counter = 0;
    static boolean[] visited = new boolean[15];

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);

        Arrays.fill(visited, false);
        countNodesAtADistantK(root, 2, 0);
        System.out.println(counter);

    }

    private static void countNodesAtADistantK(Node root, int k, int len) {

        System.out.println("Boolean Array : " + Arrays.toString(visited));
        if (root == null)
            return;

        visited[len] = false;
        len++;
        int temp = len - k - 1;
        if (root.left == null && root.right == null && temp >= 0 && visited[temp] == false) {
            visited[temp] = true;
            counter++;
        }

        countNodesAtADistantK(root.left, k, len);
        countNodesAtADistantK(root.right, k, len);
    }
}
