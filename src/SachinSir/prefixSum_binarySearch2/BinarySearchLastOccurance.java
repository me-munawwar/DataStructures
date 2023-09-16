package SachinSir.prefixSum_binarySearch2;

import java.util.Arrays;

public class BinarySearchLastOccurance {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 2, 1, 8, 6, 2, 4 };
        int x = 21;

        getLastOccurance(arr, arr.length, x);
    }

    private static void getLastOccurance(int[] arr, int n, int x) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if ((mid == n - 1 || arr[mid] < arr[mid + 1]) && arr[mid] == x) {
                System.out.println("Last occurance of " + x + " :: " + mid);
                return;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("Not Found");
    }
}
