package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class BitwiseAND {
    public static void main(String[] args) {
        int x = 2; // 0010
        int y = 5; // 0101
        int j = 12; // 1100
        int k = 15; // 1111
        /*
         * Bitwise AND returns 1 iff all bits are 1
         */
        System.out.println(x & y); // 0
        System.out.println(j & k); // 12
    }
}
