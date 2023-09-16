package SandeepSir.Maths;

public class PalindromeNumbers2 {
    public static void main(String[] args) {
        int num = 1001;
        // 121
        isPalindrome(num);
    }

    /**
     * TC : Theta(D)
     */
    private static void isPalindrome(int num) {
        int temp = num;
        int reverse = 0;

        while(num > 0) {
            reverse = reverse * 10 + num%10;
            num /= 10;
        }

        if (temp == reverse) {
            System.out.println("Palindrome Numbers");
        } else {
            System.out.println("Not Palindrome Numbers");
        }
    }
}
