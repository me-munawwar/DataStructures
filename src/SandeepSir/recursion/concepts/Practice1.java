package SandeepSir.recursion.concepts;

public class Practice1 {
    public static void main(String[] args) {
        int n = 3;
        recursiveFunction(n);
    }

    private static void recursiveFunction(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        recursiveFunction(n - 1);
        System.out.println(n);

    }
}
