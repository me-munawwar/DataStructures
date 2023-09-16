package SachinSir.prefixSum_binarySearch2;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 8, 9, 12, 18, 22, 27, 46 };
        int x = 27;
        binarySearch(arr, arr.length, x);
    }

    private static void binarySearch(int[] arr, int n, int x) {
        int l = 0;
        int r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == x) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(-1);
    }
}
