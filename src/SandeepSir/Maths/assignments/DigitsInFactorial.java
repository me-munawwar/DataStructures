package SandeepSir.Maths.assignments;

import SandeepSir.Maths.TrailingZeroInFactorial4;

public class DigitsInFactorial {
    
    public static void main(String[] args) {
        int n = 185;  // 5! -> 120, o/p : 3
        digitsInFactorial(n);
        trailingZeros(n);
    }

    private static void trailingZeros(int n) {
        TrailingZeroInFactorial4.countTrailingZeros(n);
    }

    /*
     * TC : Theta(n)
     */
    private static void digitsInFactorial(int n) {
        double count = 0;
        for(int i = 1; i <= n; i++) {
          count += Math.log10(i);
        }
        System.out.println((int) Math.floor(count) + 1 + ", is the digit count");
    }
}
