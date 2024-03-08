package SachinSir.strings;

public class SubSequencMatching {
    public static void main(String[] args) {
        String s1 = "haikloppswkj";
        String s2 = "akopwk";
        boolean b = isSubsequent(s1, s2);
        System.out.println("isSubsequent : " + b);
    }

    private static boolean isSubsequent(String s1, String s2) {

        int p1 = 0;
        int p2 = 0;

        while (p1 != s1.length() && p2 != s2.length()) {
            if (s2.charAt(p2) == s1.charAt(p1)) {
                p2++;
            }
            p1++;
        }
        if (p2 == s2.length()) {
            return true;
        }
        return false;
    }
}
