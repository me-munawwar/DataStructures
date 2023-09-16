package SachinSir.prefixSum_binarySearch2;

public class PrefixSumRangeQuery {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 2, 1, 8, 6, 2, 4 };
        int[][] Q = { { 0, 2 }, { 1, 2 }, { 3, 4 }, { 4, 4 }, { 1, 4 } };

        /*
         * Find the sum of elements in the arr from L to R given in Q
         */
        printSumLtoR(arr, arr.length, Q, Q.length);
    }

    /*
     * TC : O(Max(q + n))
     */
    private static void printSumLtoR(int[] arr, int n, int[][] Q, int q) {
        /*
         * prefixSum Array
         */
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        /*
         * Results of individual queries
         */
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];

            int result = prefixSum[R] - prefixSum[L] + arr[L];
            System.out.println(L + " to " + R + " : " + result);
        }
    }
}
