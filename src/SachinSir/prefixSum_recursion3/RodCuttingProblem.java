package SachinSir.prefixSum_recursion3;

public class RodCuttingProblem {
    public static void main(String[] args) {
        /*
         * Find the maximum cuts you can make out of a rod of length 'n', if the valid
         * number of cuts can be only a, b or c.
         */

        int rodLength = 16;
        int b = 10;
        int a = 3;
        int c = 5;
        int result = maximizeTheCuts(rodLength, a, b, c);
        System.out.println(result);
    }

    /*
     * TC : O(pow(3, n))
     */
    private static int maximizeTheCuts(int rodLength, int a, int b, int c) {
        System.out.println(rodLength);
        if (rodLength < 0) {
            return Integer.MIN_VALUE;
        }
        if (rodLength == 0) {
            return rodLength;
        }
        int cutA = maximizeTheCuts(rodLength - a, a, b, c);
        int cutB = maximizeTheCuts(rodLength - b, a, b, c);
        int cutC = maximizeTheCuts(rodLength - c, a, b, c);
        return 1 + Math.max(cutA, Math.max(cutB, cutC));
    }
}
