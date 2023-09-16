package SandeepSir.Maths;

/**
 * Here the task is to find out how many trailing zeros the factorial of a number has.
 * 
 * Challenge : Factorial of a number gets bigger exponentially wrt to the number, and can get to big to be stored in int data type
 * 
 * Inefficient Approach : calculate the factorial -> count the trailing zeros (n%10 == 0 -> count++, break otherwise)
 * 
 * Efficient Approach : Trailing zero count = (n/5) + (n/25) + (n/125) +.... (n/5^n)
 */
public class TrailingZeroInFactorial4 {
    public static void main(String[] args) {
        int n = 500;
        countTrailingZeros(n);
    }

    public static void countTrailingZeros(int n) {
        int count = 0;
        for(int i = 5; i <= n; i*=5) {
            count += n /i;
        }
        System.out.println("Trailing Zeros :: " + count);
    }
}
