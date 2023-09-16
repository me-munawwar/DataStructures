package SachinSir.prefixSum_binarySearch2;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 41, 5, 6, 7, 1, 2, 5, 9, 5, 8, 2 };
        int k = 5;
        /*
         * find the max sum of window size k;
         */
        slidingWindowMaxSum(arr, k, arr.length);
    }

    /*
     * TC : O(n)
     */
    private static void slidingWindowMaxSum(int[] arr, int k, int n) {
        System.out.println("Optimal Solution");
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int currentWindowSum = maxSum;
        for (int i = k; i < n; i++) {
            currentWindowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentWindowSum);
        }
        System.out.println(maxSum);
    }
}
