package SandeepSir.recursion.classroomPrograms;

public class IsStringPalindrome {
    public static void main(String[] args) {
        String s = "AMMI";
        boolean b = isPalindrom(s, 0, s.length() - 1);
        System.out.println("is palindrome :: " + b);

        boolean c = isPalindromeBetter(s, 0, s.length() - 1);
        System.out.println("is palindrome better :: " + c);
    }

    private static boolean isPalindrom(String s, int firstIndex, int lastIndex) {
        if (lastIndex <= firstIndex) {
            return true;
        }
        if (s.charAt(firstIndex) == s.charAt(lastIndex)) {
            return isPalindrom(s, firstIndex + 1, lastIndex - 1);
        }
        return false;
    }

    private static boolean isPalindromeBetter(String s, int firstIndex, int lastIndex) {
        if (lastIndex <= firstIndex) {
            return true;
        }
        return s.charAt(firstIndex) == s.charAt(lastIndex) && isPalindromeBetter(s, firstIndex + 1, lastIndex - 1);
        /*
         * if the first expression s.charAt(firstIndex) == s.charAt(lastIndex) evaluates
         * to be false, the compiler never evalutaes the second expression. This is
         * called as short circuiting in programming
         */
    }
}
