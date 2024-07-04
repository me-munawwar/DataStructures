package SachinSir.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningStreamMedian {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 7, 9 };
        // System.out.println("Input : " + Arrays.toString(arr));
        System.out.println("Brute Force");
        runningStreamMedianBruteForce(arr, arr.length);

        System.out.println("\nOptimal");
        runningStreamMedianOptimal(arr, arr.length);

    }

    private static void runningStreamMedianOptimal(int[] arr, int n) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b.compareTo(a));

        maxHeap.offer(arr[0]);

        for (int i = 1; i < n; i++) {
            int element = arr[i];
            if (element < maxHeap.peek()) {
                maxHeap.offer(element);
            } else {
                minHeap.offer(element);
            }

            if (Math.abs(minHeap.size() - maxHeap.size()) >= 2) {
                boolean b = minHeap.size() > maxHeap.size() ? maxHeap.offer(minHeap.poll())
                        : minHeap.offer(maxHeap.poll());
            }

            double median = 0;

            if (minHeap.size() == maxHeap.size()) {
                median = (double) (minHeap.peek() + maxHeap.peek()) / 2;
            } else {
                median = (double) minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek();
            }
            System.out.print(median + ", ");
        }
    }

    private static void runningStreamMedianBruteForce(int[] arr, int n) {
        double median = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(arr[i]);
            al.sort((a, b) -> a.compareTo(b));
            int listSize = al.size();
            if (listSize % 2 == 0) {
                median = (double) ((al.get(listSize / 2) + (al.get(listSize / 2 - 1))) / 2.0);
            } else {
                median = (double) al.get(al.size() / 2);
            }
            System.out.print(median + ", ");
        }
    }
}
