package SandeepSir.recursion.classroomPrograms;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if(n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.println(n);
    }
}
