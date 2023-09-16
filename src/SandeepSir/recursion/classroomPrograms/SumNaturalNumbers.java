package SandeepSir.recursion.classroomPrograms;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        int result = sumNaturalNumbers(n, sum);
        System.out.println("SUM :: " + result);
    }

    private static int sumNaturalNumbers(int n, int sum) {
        if (n <= 1) {
            return sum; // always be careful with the base case return statement
        }
        return sumNaturalNumbers(n - 1, sum += n);
    }
}
