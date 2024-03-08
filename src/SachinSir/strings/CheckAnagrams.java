package SachinSir.strings;

import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "ohlamesaint";
        String s2 = "themonalisa";

        boolean isAnagram = isAnagram(s1, s2);
        System.out.println("isAnagram : " + isAnagram);
    }

    private static boolean isAnagram(String s1, String s2) {
        int[] checkArray = new int[256];
        Arrays.fill(checkArray, 0);

        if (s1.length() != s2.length()) {
            return false;
        }

        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            checkArray[ch1]++;
            checkArray[ch2]--;
        }
        for (int i : checkArray) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
