package SachinSir.stacks8;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 4, 10, 2, 5 }; // {-1,-1,6,-1,10,10}
        previousGreaterElement(arr, arr.length);
    }

    private static void previousGreaterElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
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
        System.out.println();
        System.out.println(st.toString());
    }
}
