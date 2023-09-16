package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class SignedRightShift {
    
    public static void main(String[] args) {
        int n = 33; // 100001
        System.out.println(n >> 1); // 010000 -> 16
        System.out.println(n >> 4); // 000010 -> 2

        System.out.println("Observe the behavior with negative numbers");
        int x = -13;
        /*
         * 13  = 00..1101
         * ~13 = 11..0010
         * in 2s complement -13 = 11..0011
         */
        System.out.println(x >> 1); // 11...001 -> 000...111 = -7
    }
}
