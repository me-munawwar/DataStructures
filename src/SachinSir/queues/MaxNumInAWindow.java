package SachinSir.queues;

public class MaxNumInAWindow {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        printMaxNumInAWindow(arr, arr.length, k);
    }

    private static void printMaxNumInAWindow(int[] arr, int n, int k) {
        for (int start = 0; start <= n - k; start++) {
            int end = start + k - 1;
            int maxInWindow = Integer.MIN_VALUE;

            for (int i = start; i <= end; i++) {
                maxInWindow = Math.max(maxInWindow, arr[i]);
            }
            System.out.println(maxInWindow);

        }
    }
}
