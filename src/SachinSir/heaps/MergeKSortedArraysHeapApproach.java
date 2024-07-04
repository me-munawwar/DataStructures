package SachinSir.heaps;

import java.util.PriorityQueue;

public class MergeKSortedArraysHeapApproach {
    public static void main(String[] args) {
        int[][] sortedArrays = {
                { 1, 3, 5 },
                { 2, 7, 9 },
                { 4, 6, 8 }
        };

        mergeKSortedArraysHeapApproach(3, 3, sortedArrays);
    }

    public static PriorityQueue<ElementBean> pq = new PriorityQueue<>();

    private static void mergeKSortedArraysHeapApproach(int arrayCount, int arrayElements, int[][] sortedArrays) {
        createHeap(arrayCount, arrayElements, sortedArrays);

        while (!pq.isEmpty()) {
            ElementBean eb = pq.poll();
            System.out.print(eb + ", ");
            pushNextIfExists(eb, sortedArrays, arrayCount, arrayElements);
        }
        // System.out.println("Result : " + pq);
    }

    private static void pushNextIfExists(ElementBean eb, int[][] sortedArrays, int arrayCount, int arrayElements) {
        Integer row = eb.row;
        Integer col = eb.col;
        if (col < arrayElements - 1) {
            pq.offer(new ElementBean(row, col + 1, sortedArrays[row][col + 1]));
        }
    }

    private static void createHeap(int arrayCount, int arrayElements, int[][] sortedArrays) {
        for (int i = 0; i < arrayCount; i++) {
            ElementBean temp = new ElementBean(i, 0, sortedArrays[i][0]);
            pq.offer(temp);
        }

        System.out.println(pq.toString());
    }
}
