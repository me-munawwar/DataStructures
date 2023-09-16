package SachinSir.prefixSum_binarySearch2;

import java.util.Arrays;

public class PrefixSumRangeUpdate {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0 };
        int[][] Q = { { 1, 2, 2 }, { 0, 1, 1 }, { 1, 4, 1 }, { 5, 5, 2 }, { 0, 5, 2 } };

        /*
         * Q[0] -> L,R,X. From index L to R (inclusive), add X to arr[]
         */

        prefixSumRangeUpdate(arr, arr.length, Q, Q.length);
    }

    private static void prefixSumRangeUpdate(int[] arr, int n, int[][] Q, int q) {
        for (int i = 0; i < q; i++) {
            int L = Q[i][0];
            int R = Q[i][1];
            int X = Q[i][2];
            arr[L] += X;
            /*
             * Careful at the following step
             */
            if (R + 1 < n) {
                arr[R + 1] -= X;
            }

        }
        System.out.println("Intermediate State :: " + Arrays.toString(arr));
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        System.out.println("Result :: " + Arrays.toString(prefixSum));

    }
}
