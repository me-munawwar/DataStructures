package SachinSir.lecture1;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 8, 7, 4 };
        sortTheArray(arr, arr.length);
    }

    private static void sortTheArray(int[] arr, int n) {
        System.out.println("Brute Force");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
