package practice.heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int arr[] = { 12, 5, 787, 1, 23 };
        int k = 2;

        ArrayList<Integer> al = kLargestElementsBruteForce(arr, arr.length, k);
        System.out.println("Brute Force Result : " + al.toString());

        ArrayList<Integer> optimalResult = kLargestElementsOptimal(arr, arr.length, k);
        System.out.println("Optimal Force Result : " + optimalResult.toString());
    }

    private static ArrayList<Integer> kLargestElementsOptimal(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> b.compareTo(a));
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {

        }
    }

    private static ArrayList<Integer> kLargestElementsBruteForce(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (Integer integer : arr) {
            pq.add(integer);
        }

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(pq.toString());
        while (!pq.isEmpty()) {
            al.add(pq.poll());
            System.out.println(pq.toString());
            k--;
        }
        return al;
    }
}
