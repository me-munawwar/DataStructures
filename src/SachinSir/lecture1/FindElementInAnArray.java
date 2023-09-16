package SachinSir.lecture1;

public class FindElementInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 4, 5, 6, 8, 9, 10 };
        int x = 10;
        linearSearch(arr, arr.length, x);
        binarySearch(arr, arr.length, x);
    }

    /*
     * Use linear search when the given array is not sorted
     * TC : O(n)
     */
    private static void linearSearch(int[] arr, int length, int x) {
        System.out.println("Linear Search");
        int position = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(position);
    }

    /*
     * Use binary search when the given array is sorted
     * 
     * TC : O(logn)
     */

    public static void binarySearch(int[] arr, int n, int x) {
        System.out.println("binary search");
        int l = 0;
        int r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == x) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
