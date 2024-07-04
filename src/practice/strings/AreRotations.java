package practice.strings;

public class AreRotations {
    public static void main(String[] args) {
        // String s1 = "mightandmagic";
        // String s2 = "andmagicmigth";

        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        boolean b = areRotations(s1, s2);
        System.out.println("Result : " + b);

    }

    private static boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            String s1a = s1.substring(i);
            System.out.println(s1a);
            String s1b = s1.substring(i + 1);
            System.out.println(s1b);

            String s2a = s2.substring(0, s2.length() - 1 - i);
            System.out.println(s2a);

            String s2b = s2.substring(s2.length() - 1 - i);
            System.out.println(s2b);

            if (s2b.equals(s1a) && s2a.equals(s1b)) {
                return true;
            }

            System.out.println();
            System.out.println();
        }

        return false;
    }
}
