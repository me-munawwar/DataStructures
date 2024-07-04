package SachinSir.heaps;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8 };
        int[] arr2 = { 1, 3, 5, 9, 11 };

        mergeSortedArrays(arr, arr.length, arr2, arr2.length);
    }

    private static void mergeSortedArrays(int[] arr, int n1, int[] arr2, int n2) {
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (arr[i] < arr2[j]) {
                System.out.print(arr[i++] + ", ");
            } else {
                System.out.print(arr2[j++] + ", ");
            }
        }

        while (i < n1) {
            System.out.print(arr[i++] + ", ");
        }

        while (j < n2) {
            System.out.print(arr2[j++] + ", ");
        }
    }
}
