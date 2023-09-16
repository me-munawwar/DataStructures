package SandeepSir.recursion.assignments;

public class JosephusProblemPersonalSolution {
    public static void main(String[] args) {
        int n = 8;
        int survivor = survivor(n);
        System.out.println(survivor);
    }

    private static int survivor(int n) {
        if (n <= 1) {
            return n;
        }

        if ((n & (n - 1)) == 0) {
            return 1;
        }

        return 0;
    }
}
