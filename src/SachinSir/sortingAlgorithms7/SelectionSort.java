package SachinSir.sortingAlgorithms7;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };
        selectionSort(unsortedArray, unsortedArray.length);
    }

    /*
     * For every element in the array, look for other smaller numbers,
     * If the current element is found to the smaller than the previous encountered
     * smaller, update the minIndex,
     * 
     * In the end of inner full iteration, update array by swapping arr[i] &
     * arr[minIndex]
     * 
     * TC : O(n*n)
     * SC : O(1)
     */
    private static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] <= arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex, arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
