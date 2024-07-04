package SachinSir.heaps;

import java.util.Arrays;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        int[][] soretedArrays = {
                { 1, 3, 5 },
                { 2, 7, 9 },
                { 4, 6, 8 }
        };

        // mergeKSortedArrays(3, 3, soretedArrays);
        mergeKSortedArraysMine(3, 3, soretedArrays);
    }

    public static int[] mergeKSortedArrays(int arrayCount, int arrayElements, int[][] sortedArrays) {
        int totalSize = arrayCount * arrayElements;
        int[] result = new int[totalSize];
        int[] pointers = new int[arrayCount];

        for (int i = 0; i < totalSize; i++) {
            int rowContainigMinValue = -1;
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < arrayCount; j++) {
                if (pointers[j] < arrayElements && sortedArrays[j][pointers[j]] < minVal) {
                    rowContainigMinValue = j;
                    minVal = sortedArrays[j][pointers[j]];
                }
            }
            result[i] = minVal;
            System.out.println(Arrays.toString(result));
            pointers[rowContainigMinValue]++;
        }
        System.out.println("Result : " + Arrays.toString(result));
        return result;
    }

    public static int[] mergeKSortedArraysMine(int arrayCount, int arrayElements, int[][] soretedArrays) {
        int totalElements = arrayCount * arrayElements;
        int[] result = new int[totalElements];
        int pointers[] = new int[arrayCount];

        for (int j = 0; j < totalElements; j++) {
            int minValue = Integer.MAX_VALUE;
            int rowContainigMinValue = -1;
            for (int i = 0; i < arrayCount; i++) {
                if (pointers[i] < arrayCount && soretedArrays[i][pointers[i]] < minValue) {
                    minValue = soretedArrays[i][pointers[i]];
                    rowContainigMinValue = i;
                }
            }
            result[j] = minValue;
            pointers[rowContainigMinValue] = pointers[rowContainigMinValue] + 1;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
