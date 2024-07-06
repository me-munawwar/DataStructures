package practice.arr;

import java.util.ArrayList;
import java.util.Arrays;

import util.Node;

public class KSizedSubArrayMax {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        max_of_subarrays(arr, arr.length, 3);
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || k <= 0) {
            return result;
        }
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        // Fill the left array,
        for (int i = 1; i < n; i++) {
            if (i % k == 0) {
                // copies the first element of each block
                left[i] = arr[i]; // block start
            } else {
                left[i] = Math.max(left[i - 1], arr[i]);
            }
        }

        // Fill the right array,
        for (int i = n - 2; i >= 0; i--) {
            if ((i + 1) % k == 0) {
                // copies the last element of each block
                right[i] = arr[i]; // block end
            } else {
                right[i] = Math.max(right[i + 1], arr[i]);
            }
        }

        // System.out.println(Arrays.toString(arr));
        System.out.println("Left:");
        System.out.println(Arrays.toString(left));

        System.out.println("Right:");
        System.out.println(Arrays.toString(right));

        // System.out.println("Result:\n" + result);

        // Calculate the maximums for each window
        for (int i = 0; i <= n - k; i++) {
            System.out.println("Comparing left's " + (i + k - 1) + ", with right's " + i);
            result.add(Math.max(left[i + k - 1], right[i]));
        }

        return result;
    }
}
