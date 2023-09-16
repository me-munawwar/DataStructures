package SandeepSir.recursion.classroomPrograms;

public class BinaryEquivalentOfNumber {
    public static void main(String[] args) {
        int n = 10; // 1010
        binaryEquivalent(n);
    }

    private static void binaryEquivalent(int n) {
        if(n == 0) {
            return;
        }
        binaryEquivalent(n/2);
        System.out.print(n%2 + " ");

    }
}
