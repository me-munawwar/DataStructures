package SandeepSir.Maths;

public class CountDigits1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Count Digits :: ");
        int num = 123456;

        countDigits(num);
        System.out.println("Number of digits, recursive :: " + countDigitsRecursive(num));
    }

    /**
     * TC : Theda(D)
     */
    private static void countDigits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        System.out.println("Number of digits :: " + count);
    }

    /**
     * TC : T(D) + Theta(1)
     */
    private static int countDigitsRecursive(int num) {
        if(num == 0) {
            return 0;
        }
        return 1 + countDigitsRecursive(num/10);
    }
}
