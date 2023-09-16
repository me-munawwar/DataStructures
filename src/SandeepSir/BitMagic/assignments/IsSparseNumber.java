package SandeepSir.BitMagic.assignments;

public class IsSparseNumber {
    public static void main(String[] args) {
        int n = 16;

        boolean b = isSparseNumber(n);
        System.out.println(b);
    }

    /*
     * A number said to be a sparse number if no consecutive bits are set in its
     * binary representation
     * 5 -> 101
     * 16 -> 10000
     * 
     * TC : Theta(1)
     */
    private static boolean isSparseNumber(int n) {
        return (n & (n >> 1)) == 0;
    }
}
