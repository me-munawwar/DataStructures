package SachinSir.stacks8;

import java.util.Stack;

import javafx.util.Pair;

public class GetMinimumWrapper {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 5, 1 };
        Stack<Integer> originalStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        for (int i : arr) {
            originalStack.push(i);
            if (!minStack.isEmpty()) {
                if (i < minStack.peek()) {
                    minStack.push(i);
                } else {
                    minStack.push(minStack.peek());
                }
            } else {
                minStack.push(i);
            }
        }

        System.out.println("Stack1 : " + originalStack.toString());
        System.out.println("Stack2 : " + minStack.toString());
    }
}
