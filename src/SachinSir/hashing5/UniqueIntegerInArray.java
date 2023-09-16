package SachinSir.hashing5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueIntegerInArray {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 87, 2, 1, 6 };
        int n = arr.length;

        /*
         * Find the unique interger in an array if all elements are <= 1000
         */

        int uniqueBetter = uniqueIntergersBetter(arr, n);
        System.out.println(uniqueBetter);

        int unique = uniqueIntergers(arr, arr.length);
        System.out.println(unique);
    }

    /*
     * TC : O(n)
     * SC : O(n)
     */
    private static int uniqueIntergers(int[] arr, int n) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }

    /*
     * TC : O(n)
     * SC : O(1000)
     */
    private static int uniqueIntergersBetter(int[] arr, int n) {
        int[] aux = new int[1000];
        for (int i = 0; i < n; i++) {
            aux[arr[i]] += 1;
        }

        int unique = 0;
        for (int i = 0; i < 1000; i++) {
            if (aux[i] != 0) {
                unique++;
            }
        }

        return unique;
    }
}
