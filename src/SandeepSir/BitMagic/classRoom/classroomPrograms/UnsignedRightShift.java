package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class UnsignedRightShift {
    public static void main(String[] args) {
        int x = -2;
        /*
         * Here, Sign bit, i.e MSB is not preserved, hence the number changes drastically
         */
        System.out.println(x >>> 1);
    }
}
