package SachinSir.binaryTrees.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import util.Node;

public class LeveOrderTraversal {
    static int itrCount;

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(8);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> al = levelOrder(root);

    }

    private static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        LinkedHashMap<Integer, ArrayList<Integer>> hMap = new LinkedHashMap<>();
        levelOrderUtil(root, hMap, 0);
        System.out.println("HashMap : " + hMap.toString());
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collection<ArrayList<Integer>> values = hMap.values();
        values.forEach(v -> {
            result.add(v);
        });

        System.out.println("iteration count : " + itrCount);
        return result;

    }

    private static void levelOrderUtil(Node root, LinkedHashMap<Integer, ArrayList<Integer>> hMap, int len) {
        itrCount++;
        if (root == null) {
            return;
        }
        len++;
        if (hMap.containsKey(len)) {
            hMap.get(len).add(root.data);
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(root.data);
            hMap.put(len, al);
        }

        levelOrderUtil(root.left, hMap, len);
        levelOrderUtil(root.right, hMap, len);
    }
}
