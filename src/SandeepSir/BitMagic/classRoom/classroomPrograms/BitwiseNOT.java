package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class BitwiseNOT {
    public static void main(String[] args) {
        int x = 6; // 0110 -> ~6 == 1001 -> -7

        int y = 11; // 1011 -> ~11 == 0100 -> 4 ? wrong
        System.out.println(~x);
        
        /*
         * In Java, integers are represented using a signed 32-bit two's complement representation. 
         * 11  -> 00000....1011
         * ~11 -> 11111....0100 -> -12
         */
        System.out.println(~y); // 
    }
}
