package SachinSir.strings;

public class IsSubstring {
    public static void main(String[] args) {
        String s1 = "gentleman";
        String s2 = "gentle";

        boolean b = isSubstring(s1, s2);
        System.out.println("isSubstring : " + b);
    }

    private static boolean isSubstring(String s1, String s2) {
        int k = s2.length();
        for (int i = 0; i <= s1.length() - k; i++) {
            if (s1.substring(i, i + k).equals(s2)) {
                return true;
            }

        }
        return false;
    }
}
