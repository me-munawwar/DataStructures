package SachinSir.stacks8;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 4, 10, 2, 5 }; // -> [-1,4,2,2,-1,-1]

        nextSmallerElement(arr, arr.length);
    }

    /*
     * This program will print the solution in reverse order
     * 
     * TC : O(n)
     * SC : O(n)
     */
    private static void nextSmallerElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.push(arr[i]);
        }
        System.out.println();
        System.out.println(st.toString());
    }

    /*
     * This solution will print the result in the correct order as a cost of one
     * extra Stack
     * 
     * TC : O(n)
     * SC : O(2 * n) -> O(n)
     */
    private static void nextSmallerElementCorrectOrder(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> correctOrder = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                correctOrder.push(-1);
            } else {
                correctOrder.push(st.peek());
            }
            st.push(arr[i]);
        }
        System.out.println(st.toString());

        while (correctOrder.size() != 0) {
            System.out.print(correctOrder.pop() + " ");
        }
    }
}
