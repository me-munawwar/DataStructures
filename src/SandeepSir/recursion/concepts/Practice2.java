package SandeepSir.recursion.concepts;

public class Practice2 {
    public static void main(String[] args) {
        int n = 4;
        recursiveFunction(n);
    }

    private static void recursiveFunction(int n) {
        if(n == 0) {
            return;
        }

        recursiveFunction(n - 1);
        System.out.println(n);
        recursiveFunction(n - 1);
    }

    /*
     * Output :
     * 1
     * 2
     * 1
     * 3
     * 1
     * 2
     * 1
     * 4
     * 1
     * 2
     * 1
     * 3
     * 1
     * 2
     * 1
     */
}
