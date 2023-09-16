package SandeepSir.recursion.classroomPrograms;

public class SubsetsOfString {
    public static void main(String[] args) {
        String s = "abc";

        printSubsets(s, "", 0);
    }

    private static void printSubsets(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        printSubsets(s, curr, i + 1);
        printSubsets(s, curr + s.charAt(i), i + 1);
    }
}
