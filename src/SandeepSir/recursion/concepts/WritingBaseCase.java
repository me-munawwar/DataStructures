package SandeepSir.recursion.concepts;

public class WritingBaseCase {
    public static void main(String[] args) {
        int n = 5;
        /*
         * print the nth fibonacci number
         */

        int b = printFibonacci(n);
        System.out.println(b);
    }

    private static int printFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
}
