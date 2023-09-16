package SachinSir.stacks8;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        /*
         * 5,25,25,-1
         * 
         * int arr[] = { 1, 6, 4, 10, 2, 5 };
         */

        // nextGreaterElementBruteForce(arr, arr.length);
        nextGreaterElementOptimized(arr, arr.length);
    }

    /*
     * This solution will print the result in reverse order,
     * One more Stack can be used to correct the order
     */
    private static void nextGreaterElementOptimized(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.push(arr[i]);
        }

    }

    private static void nextGreaterElementBruteForce(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int nge = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nge = arr[j];
                    break;
                }
            }
            System.out.print(nge + " ");
        }
    }
}
