package SachinSir.binaryTrees.practice;

import java.util.ArrayList;

import util.Node;

public class CheckIdenticalTrees {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        boolean checkIfIdentical = checkIfIdentical(root1, root2);

        System.out.println(checkIfIdentical);
    }

    private static boolean checkIfIdentical(Node root1, Node root2) {
        ArrayList<Integer> inAl1 = inOrder(root1, new ArrayList<Integer>());
        ArrayList<Integer> inAl2 = inOrder(root2, new ArrayList<Integer>());

        ArrayList<Integer> preAl = preOrder(root1, new ArrayList<Integer>());
        ArrayList<Integer> preAl2 = preOrder(root2, new ArrayList<Integer>());

        ArrayList<Integer> postAl = postOrder(root1, new ArrayList<Integer>());
        ArrayList<Integer> postAl2 = postOrder(root2, new ArrayList<Integer>());

        if (inAl1.equals(inAl2) && preAl.equals(preAl2) && postAl.equals(postAl2)) {
            return true;
        } else {
            return false;
        }

    }

    private static ArrayList<Integer> inOrder(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return arrayList;
        }
        arrayList = inOrder(root.left, arrayList);
        arrayList.add(root.data);
        arrayList = inOrder(root.right, arrayList);

        return arrayList;
    }

    private static ArrayList<Integer> preOrder(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return arrayList;
        }
        arrayList.add(root.data);
        arrayList = inOrder(root.left, arrayList);
        arrayList = inOrder(root.right, arrayList);

        return arrayList;
    }

    private static ArrayList<Integer> postOrder(Node root, ArrayList<Integer> arrayList) {
        if (root == null) {
            return arrayList;
        }
        arrayList = inOrder(root.left, arrayList);
        arrayList = inOrder(root.right, arrayList);
        arrayList.add(root.data);

        return arrayList;
    }

}
