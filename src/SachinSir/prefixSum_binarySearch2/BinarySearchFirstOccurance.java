package SachinSir.prefixSum_binarySearch2;

import java.util.Arrays;

public class BinarySearchFirstOccurance {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 2, 1, 8, 6, 2, 4 };
        int x = 21;

        getFirstOccurance(arr, arr.length, x);

    }

    private static void getFirstOccurance(int[] arr, int n, int x) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == x && (mid == 0 || arr[mid - 1] < arr[mid])) {
                System.out.println("First Occurance of " + x + " :: " + mid);
                return;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                r = mid + 1;
            }
        }
        System.out.println("Not Found");
    }
}
