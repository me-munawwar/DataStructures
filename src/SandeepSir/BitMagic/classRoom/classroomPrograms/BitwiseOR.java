package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class BitwiseOR {
    public static void main(String[] args) {
        int x = 13; // 1101
        int y = 7; //  0111

        int j = 3; //  0011
        int k = 8; //  1000

        System.out.println(x|y); // 1111 -> 15
        System.out.println(j | k); // 1011 -> 11

        System.out.println(y | x); // 15
        System.out.println(k | j); // 11
    }
}
