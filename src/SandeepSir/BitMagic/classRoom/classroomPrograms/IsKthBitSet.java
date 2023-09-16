package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class IsKthBitSet {
    public static void main(String[] args) {
        int num = 16; // 10000
        int bit = 5; // 
        isKthBitSet(num, bit);
        naive1(num, bit);
        efficient1(num, bit);
        naive2(num, bit);
        efficient2(num, bit);
    }

   

    /*
     * Idea -> Find a number with whose only kth bit is set,
     * k = 1 -> num = pow(2,0)
     * k = 2 -> num = pow(2,1)
     * k, num= pow(2,k-1)
     * 
     * TC : 
     */
    public static boolean isKthBitSet(int num, int bit) {
        System.out.println("My approach :: ");
        int bitValue = (int) Math.pow(2, bit -1);
        if((num & bitValue) != 0) {
            System.out.println("Set");
            return true;
        } else {
            System.out.println("Not Set");
            return false;
        }

    }

    /*
     * TC : Theta(bit)
     */
    private static boolean naive1(int num, int bit) {
        System.out.println("Naive 1 :: ");
        int x = 1;
        for(int i = 0; i < (bit -1); i++) {
            x *= 2;
        }

        if((num & x) != 0) {
            System.out.println("Set");
            return true;
        } else {
            System.out.println("Not Set");
            return false;
        }
    }

    public static boolean efficient1(int n, int k) {
        System.out.println("Efficient 1 :: ");
        int x = (1 << (k-1));
        if((n&x) != 0) {
            System.out.println("Set");
            return true;
        } else {
            System.out.println("Not Set");
            return false;
        }
    }



    public static boolean naive2(int n, int k) {
        System.out.println("Naive2 :: ");
        for(int i = 0; i < (k-1); i++) {
            n /= 2;
        }

        if((n&1) != 0) {
            System.out.println("Set");
            return true;
        } else {
            System.out.println("Not Set");
            return false;
        }
    }

    public static boolean efficient2(int n, int k) {
        System.out.println("Efficient2");
        n  = (n >> (k-1));
        if((n&1) != 0) {
            System.out.println("Set");
            return true;
        } else {
            System.out.println("Not Set");
            return false;
        }
    }
}
