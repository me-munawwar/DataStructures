package SachinSir.prefixSum_recursion3.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int blocks[] = { 3, 0, 2, 0, 4 };
        int trappedWater = calculateTrappedWater(blocks, blocks.length);
        int trappedWaterEfficient = calculateTrappedWaterEfficient(blocks, blocks.length);
    }

    /*
     * TC : O(n*n)
     */
    private static int calculateTrappedWater(int[] arr, int n) {
        System.out.println("First Solution :: ");
        if (n < 2) {
            return 0;
        }
        int trappedWater = 0;

        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            trappedWater += Math.min(left, right) - arr[i];
        }
        System.out.println("Trapped water :: " + trappedWater);
        return trappedWater;
    }

    private static int calculateTrappedWaterEfficient(int[] blocks, int n) {
        System.out.println("Efficient Solution");
        if (n < 2) {
            return 0;
        }
        int trappedWater = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = blocks[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], blocks[i]);
        }
        System.out.println("Left Array :: " + Arrays.toString(left));

        right[n - 1] = blocks[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], blocks[i]);
        }
        System.out.println("Right Array :: " + Arrays.toString(right));

        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(left[i], right[i]) - blocks[i];
        }
        System.out.println("Trapped Water :: " + trappedWater);
        return trappedWater;
    }
}
