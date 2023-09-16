package SachinSir.prefixSum_binarySearch2;

public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7, 19, 50, 1, 53 };
        /*
         * Find max difference such that the bigger element is at at the right of
         * smaller element
         * { 2, 3, 6, 7, 19, 45, 1, 53 } - > (53-1 = 43, NOT (45 - 1= 44))
         */
        maxDifference(arr, arr.length);
        maxDifferenceOptimal(arr, arr.length);
    }

    /*
     * TC : O(n)
     */
    private static void maxDifferenceOptimal(int[] arr, int n) {
        System.out.println("Optimal Solution :: ");
        int min = arr[0];
        int maxDiff = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            if (arr[i] > min) {
                int currentDiff = arr[i] - min;
                maxDiff = Math.max(maxDiff, currentDiff);
            }
        }
        System.out.println(maxDiff);
    }

    /*
     * TC : O(n*n)
     */
    private static void maxDifference(int[] arr, int n) {
        System.out.println("Brute Force");
        int maxDiff = 0;
        int currentDiff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    currentDiff = arr[j] - arr[i];
                }
                maxDiff = Math.max(maxDiff, currentDiff);
            }
        }
        System.out.println(maxDiff);
    }
}
