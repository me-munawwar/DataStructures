package SandeepSir.recursion.concepts;

public class TailRecursion {
    public static void main(String[] args) {
        int n = 10;
        printNtoOne(n); // recursive call
        /*
         * when Recursive call is the last thing a method does, it's called a tail recursion.
         * tail recursions are usually faster in execution because the method doesn't have to remember the state.
         * 
         * and most modern compilers convert the code to sort of while loop or goto statement
         */
        printNtoOneBetter(n);
    }

    private static void printNtoOne(int n) {
        if( n == 0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }
    private static void printNtoOneBetter(int n) {
        // abc here
        start :
        if( n == 0) 
            return;

        System.out.println(n);
        printNtoOneBetter(n - 1); // v1
        n = n - 1; // v2
        /*
         * This process of removed the recursive call is called as Tail Call Elimination
         */
        // goto abc; v2
    }
}
