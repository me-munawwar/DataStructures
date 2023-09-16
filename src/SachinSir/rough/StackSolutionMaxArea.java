package SachinSir.rough;

import java.util.Arrays;
import java.util.Stack;

public class StackSolutionMaxArea {
    static int n = 6;
    static int[] left = new int[n];
    static int[] right = new int[n];

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 5, 9 };

        smallerElementOnLeftSide(arr, arr.length);
        smallerElementOnRightSide(arr, arr.length);
    }

    private static void smallerElementOnRightSide(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        System.out.println(st.toString());
        System.out.println(Arrays.toString(left));

    }

    private static void smallerElementOnLeftSide(int[] arr, int length) {
    }
}
