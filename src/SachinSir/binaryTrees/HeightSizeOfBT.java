package SachinSir.binaryTrees;

public class HeightSizeOfBT {
    public static void main(String[] args) {
        int treeHeight = treeHeight(new Node());
        int treeSize = treeSize(new Node());

    }

    /*
     * TC : O(number of nodes)
     * SC : O(height of the tree)
     */
    private static int treeSize(Node root) {
        if (root == null) {
            return 0;
        } else {
            int l = treeSize(root.left);
            int r = treeSize(root.right);
            return l + r + 1;
        }
    }

    /*
     * TC : O(number of nodes)
     * SC : O(height of the tree)
     */
    private static int treeHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int l = treeHeight(root.left);
            int r = treeHeight(root.right);
            return Math.max(l, r) + 1;
        }
    }
}
