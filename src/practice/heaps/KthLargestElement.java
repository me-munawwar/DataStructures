package practice.heaps;

import java.util.PriorityQueue;

public class KthLargestElement {
    static PriorityQueue<Integer> pq;

    public static void main(String[] args) {
        int arr[] = { 12, 5, 787, 1, 23 };
        int k = 2;

        int result = kthLargestElementBruteForce(arr, arr.length, k);
        System.out.println("Result : " + result);

        int optimalResult = kthLargestElementOptimal(arr, arr.length, k);
        System.out.println("Optimal result : " + optimalResult);
    }

    /*
     * TC : O(nlogk)
     * SC : O(n)
     */
    private static int kthLargestElementOptimal(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < n; i++) {
            int curr = arr[i];
            if (curr > pq.peek()) {
                pq.poll();
                pq.offer(curr);
            }
        }

        return pq.peek();
    }

    /*
     * TC : O(nlogn)
     * SC : O(n)
     */
    private static int kthLargestElementBruteForce(int[] arr, int length, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (Integer integer : arr) {
            pq.add(integer);
        }
        System.out.println(pq.toString());
        int result = Integer.MIN_VALUE;
        while (k > 0) {
            result = pq.poll();
            k--;
        }
        return result;
    }
}