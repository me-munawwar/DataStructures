package SachinSir.prefixSum_recursion3;

public class MaximizeRodCuttingCost {
    public static void main(String[] args) {
        int rodLength = 5;
        int[] cost = { 1, 2, 4, 2, 5 };
        /*
         * i -> length
         * cost[i] -> cost associated with that length
         */

        int maxCost = maximizeRodCuttingCost(rodLength, cost);
        System.out.println(maxCost);
    }

    /*
     * TC : O(pow(number of possible parts, n))
     */
    private static int maximizeRodCuttingCost(int rodLength, int[] cost) {
        if (rodLength < 0) {
            return Integer.MIN_VALUE;
        }

        if (rodLength == 0) {
            return rodLength;
        }
        int maxCost = Integer.MIN_VALUE;

        for (int i = 1; i <= cost.length; i++) {
            int individualCosts = cost[i - 1] + maximizeRodCuttingCost(rodLength - i, cost);
            maxCost = Math.max(maxCost, individualCosts);
        }

        return maxCost;
    }

}
