package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class BitwiseXOR {
    public static void main(String[] args) {
        int x = 5; // 0101
        int y = 3; // 0011 

        int j = 11; // 1011
        int k = 13; // 1101

        /*
         * The XOR (exclusive OR) operation is a binary operation that takes two inputs and returns true (1) if exactly one of the inputs is true, and false (0) otherwise
         */
        System.out.println(x ^ y); // 0110 -> 6
        System.out.println(j^k); // 0110 -> 6
    }
}
