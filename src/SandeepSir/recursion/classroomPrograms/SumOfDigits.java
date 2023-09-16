package SandeepSir.recursion.classroomPrograms;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sumOfDigits = sumOfDigits(n, 0);
        System.out.println("Some of digits :: " + sumOfDigits);
    }

    private static int sumOfDigits(int n, int sum) {
        if (n < 9) {
            return sum + n;
        }
        return sumOfDigits(n / 10, sum += n % 10);
    }
}
