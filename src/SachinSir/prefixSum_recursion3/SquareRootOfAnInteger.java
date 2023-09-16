package SachinSir.prefixSum_recursion3;

public class SquareRootOfAnInteger {
    public static void main(String[] args) {
        int n = 26;

        /*
         * print square root if it is a perfect square else print the integral par of
         * solution
         * 
         */

        squareRootOrIntegralPart(n);
    }

    /*
     * TC : O(logn)
     */
    private static int squareRootOrIntegralPart(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int integralPart = 0;
        for (int i = 2; i * i <= n; i++) {
            if (i * i <= n) {
                integralPart = i;
            }
        }
        System.out.println("Result :: " + integralPart);
        return integralPart;
    }
}
