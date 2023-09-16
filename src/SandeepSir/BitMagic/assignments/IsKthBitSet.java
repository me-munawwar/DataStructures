package SandeepSir.BitMagic.assignments;

public class IsKthBitSet {
    public static void main(String[] args) {
        int n = 8;
        int k = 1;
        boolean b = isKthBitSet(n, k);
        System.out.println(b);
    }

    private static boolean isKthBitSet(int n, int k) {
        return (n & (1 << k)) != 0;
    }
}
