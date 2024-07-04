package zzPotd;

public class SummedMatrix {
    public static void main(String[] args) {
        int result = summedMatrix(5, 2);
        System.out.println(result);
    }

    private static int summedMatrix(int n, int q) {

        int diff = n + 1 - q;
        diff = diff < 0 ? -diff : diff;
        return n - diff > 0 ? n - diff : 0;
    }
}
