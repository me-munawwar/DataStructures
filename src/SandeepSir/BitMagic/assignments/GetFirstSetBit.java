package SandeepSir.BitMagic.assignments;

public class GetFirstSetBit {
    public static void main(String[] args) {
        int n = 64;
        printFirstSetBit(n);
    }

    private static void printFirstSetBit(int n) {
        if (n == 0) {
            return;
        }

        int position = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                System.out.println(position);
                return;
            }
            position++;
            n >>= 1;
        }

    }
}
