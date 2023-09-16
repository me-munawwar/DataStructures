package SachinSir.prefixSum_binarySearch2;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 2, 1, 8, 6, 2, 4 };
        prefixSum(arr, arr.length);
    }

    /*
     * TC : O(n)
     */
    private static void prefixSum(int[] arr, int n) {
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}
