package SachinSir.heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencyOfMostOccuringElements {
    static HashMap<Integer, Integer> intFrequency = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        // int arr[] = { 3, 3, 3, 4, 1, 1, 6, 1 };
        kMostFrequent(arr, arr.length, 2);
    }

    static int kMostFrequent(int arr[], int n, int k) {
        int result = 0;
        PriorityQueue<IntegerFrequency> maxHeap = new PriorityQueue<IntegerFrequency>(k);

        for (int i : arr) {
            if (intFrequency.containsKey(i)) {
                intFrequency.put(i, intFrequency.get(i) + 1);
            } else {
                intFrequency.put(i, 1);
            }
        }

        System.out.println(intFrequency.toString());
        for (Map.Entry<Integer, Integer> entry : intFrequency.entrySet()) {
            maxHeap.offer(new IntegerFrequency(entry.getKey(), entry.getValue()));
        }

        for (int i = 0; i < k; i++) {
            result += maxHeap.poll().frequency;
        }

        // System.out.println(result);
        return result;
    }

}

class IntegerFrequency implements Comparable<IntegerFrequency> {
    public Integer integer;
    public Integer frequency;

    public IntegerFrequency(Integer integer, Integer frequency) {
        this.integer = integer;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "IntegerFrequency [integer=" + integer + ", frequency=" + frequency + "]";
    }

    public IntegerFrequency() {
    };

    @Override
    public int compareTo(IntegerFrequency o) {
        return o.frequency.compareTo(this.frequency);
    }
}
