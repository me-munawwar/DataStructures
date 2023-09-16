package SandeepSir.recursion.concepts;

public class CovertToTailRecursion {
    public static void main(String[] args) {
        int n = 10;
        recursiveOneToN(n);
        tailRecursiveOneToN(n, 1);
    }

    private static void recursiveOneToN(int n) {
        if(n == 0) {
            return;
        }

        recursiveOneToN(n - 1);
        System.out.println(n);
    }

    /*
     * Pass one extra variable to make it a tail recursive code
     */
    private static void tailRecursiveOneToN(int n, int k) {
        if(n == 0) {
            return;
        }
        System.out.println(k);
        tailRecursiveOneToN(n - 1, k + 1);
    }

}
