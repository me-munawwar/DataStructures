package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        int x = 15; // 00000...1111

        /*
         * result = x * pow(2,shiftByNum)
         * Therefore, result = 15 * pow(2,2) = 60
         */
        System.out.println(x << 2); // 32+16+8+4 = 60
        System.out.println(x << 3); // 120
    }
}
