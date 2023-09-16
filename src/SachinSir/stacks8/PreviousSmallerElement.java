package SachinSir.stacks8;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 4, 10, 2, 5 };
        nearestSmallerElementToTheLeft(arr, arr.length);
    }

    private static void nearestSmallerElementToTheLeft(int[] arr, int n) {
        Stack<Integer> st = new Stack<Integer>();
        for (int curr : arr) {
            while (!st.isEmpty() && st.peek() > curr) {
                st.pop();
            }
            if (st.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(st.peek() + " ");
            }
            st.push(curr);
        }
    }
}
