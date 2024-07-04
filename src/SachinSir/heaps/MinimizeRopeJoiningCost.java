package SachinSir.heaps;

import java.util.PriorityQueue;

public class MinimizeRopeJoiningCost {

    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        minimizeRopeJoiningCost(arr, arr.length);
    }

    private static void minimizeRopeJoiningCost(int[] arr, int n) {
        for (int i : arr) {
            minHeap.offer(i);
        }

        int minSum = 0;
        while (minHeap.size() >= 2) {
            int currentMinSum = minHeap.poll() + minHeap.poll();
            minSum += currentMinSum;
            minHeap.offer(currentMinSum);
        }
        while (minHeap.isEmpty()) {
            minSum += minHeap.poll();
        }

        System.out.println(minSum);
    }
}
