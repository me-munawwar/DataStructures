package SachinSir.rough;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = { 7, 4, 0, 9 };
        calculateTrappedWater(arr, arr.length);
    }

    private static void calculateTrappedWater(int[] arr, int n) {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int result = 0;

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        System.out.println(Arrays.toString(leftMax));

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        System.out.println(Arrays.toString(rightMax));

        for (int i = 0; i < n; i++) {
            result += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        System.out.println(result);
    }
}
