package SandeepSir.Maths;

public class Factorial3 {
    public static void main(String[] args) {
        int num = 5;
        factorial(num);
        int recursiveFact = recursiveFactorial(num);
        System.out.println("Recursive factorial :: " + recursiveFact);
    }

    private static int recursiveFactorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * recursiveFactorial(--num);
    }

    /**
     * TC : Theta(n)
     */
    private static void factorial(int i) {
        int factorial = 1;
        while(i >= 1) {
            factorial *= i;
            i--;
        }
        System.out.println("Factorial :: " + factorial);
    }
}
