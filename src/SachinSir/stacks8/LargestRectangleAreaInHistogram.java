package SachinSir.stacks8;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleAreaInHistogram {
    public static void main(String[] args) {
        // int[] arr = { 6, 3, 5, 4, 5, 3, 6 };
        int[] arr = { 2, 2, 8, 8, 2, 2 };

        // largestAreaInHistogram(arr, arr.length);

        // largestAreaInHistogramOptimalSolution(arr, arr.length);

        largestAreaInHistogramFinest(arr, arr.length);
    }

    /*
     * TC : O(n)
     */
    private static void largestAreaInHistogramFinest(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        int areaWithTop = 0;

        int i = 0;
        while (i < n) {
            if (st.isEmpty() || arr[i] >= arr[st.peek()]) {
                st.push(i++);
            } else {
                int top = st.pop();
                areaWithTop = arr[top] * (st.isEmpty() ? i : i - st.peek() - 1);
                maxArea = Math.max(areaWithTop, maxArea);
                System.out.println("maxAreaInner : " + maxArea);

            }
            System.out.println("stack : " + st.toString());
        }

        while (!st.isEmpty()) {
            int top = st.pop();
            areaWithTop = arr[top] * (st.isEmpty() ? i : i - st.peek() - 1);
            maxArea = Math.max(areaWithTop, maxArea);

        }

        // System.out.println("stack : " + st.toString());
        System.out.println("maxArea : " + maxArea);
    }

    /*
     * TC : O(n*n)
     * For every arr[i], calculate the width on its right, add it with the width on
     * left, then area = width * arr[i]
     * 
     * TC : O(n*n)
     */
    private static void largestAreaInHistogram(int[] arr, int n) {

        int area = 0;
        for (int i = 0; i < n; i++) {
            int width = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    width++;
                } else {
                    break;
                }
            }

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    width++;
                } else {
                    break;
                }
            }
            area = Math.max(area, width * arr[i]);
        }
        System.out.println(area);
    }

    private static void largestAreaInHistogramOptimalSolution(int[] arr, int n) {
        int ps[] = previousSmaller(arr, n);
        int ns[] = nextSmaller(arr, n);
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentArea = arr[i] * (ns[i] - ps[i] - 1);
            System.out.println("current area : " + currentArea);
            maxArea = Math.max(maxArea, currentArea);

        }
        System.out.println(maxArea);
    }

    private static int[] previousSmaller(int[] arr, int n) {
        // int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        int ps[] = new int[n];
        Stack<Integer> st = new Stack<>();
        /*
         * This stack will not hold the elements in accending order, instead it will
         * hold the indexes if the elements occured in increasing order, else pop
         */

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (!st.isEmpty() && curr < arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(st.toString());
        System.out.println(Arrays.toString(ps));
        return ps;
    }

    private static int[] nextSmaller(int[] arr, int n) {
        int[] ns = new int[n];
        Stack<Integer> st = new Stack<>();
        // int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        // [1, 5, 3, 5, 5, -1, -1]

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (!st.isEmpty() && curr < arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ns[i] = -1;
            } else {
                ns[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(st.toString());
        System.out.println(Arrays.toString(ns));
        return ns;
    }

}
