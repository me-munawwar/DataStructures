package SandeepSir.recursion.classroomPrograms;

public class ConvertToTailRecursive {
    public static void main(String[] args) {
        int n = 5;
        int recursiveFact = recursiveFactorial(n);
        System.out.println("Recursive Factorial :: " + recursiveFact);

        int tailRecursiveFact = tailRecursiveFactorail(n, 1);

        System.out.println("Tail Recursive Factorial :: " + tailRecursiveFact);
    }

    private static int recursiveFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
        /*
         * Here, last statement is multiplication of n and method return
         */
    }

    /*
     * Passing one more variable that carries the factorial makes the function as
     * tail recursive fuction. Modern compilers treat this as while loop
     */
    private static int tailRecursiveFactorail(int n, int fact) {
        if (n == 1 || n == 0) {
            return fact;
        }
        return tailRecursiveFactorail(n - 1, fact * n);
    }
}
