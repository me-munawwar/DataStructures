package SandeepSir.BitMagic.assignments;

public class CountBitsFlip {
    public static void main(String[] args) {
        int a = 27;
        int b = 17;
        int bitFlipCount = countBitsFlip(a, b);
        System.out.println("FlipCount :: " + bitFlipCount);
    }

    private static int countBitsFlip(int a, int b) {
        int xorResult = a ^ b;
        int flipCount = 0;
        while (xorResult != 0) {
            xorResult &= xorResult - 1;
            flipCount++;
        }
        return flipCount;
    }
}
