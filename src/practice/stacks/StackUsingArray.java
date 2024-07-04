package practice.stacks;

public class StackUsingArray {
    int top;
    int arr[] = new int[1000];

    public void push(int i) {
        arr[top] = i;
    }

    public int pop() {
        int result = arr[top];
        top--;
        return result;
    }
}
