package SachinSir.heaps;

import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;
        sortNearlySortedArray(arr, arr.length, k);
    }

    private static void sortNearlySortedArray(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.offer(arr[i]);
        }
        for (int i = k + 1; i < n; i++) {
            System.out.print(pq.poll() + ", ");
            pq.offer(arr[i]);
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + ", ");
        }
    }
}
