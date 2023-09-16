package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class TableSolutionToCountBits {
    static int[] table = new int[256];

    static {
        initialize();
    }
    public static void main(String[] args) {
        int n = 15;
        int bitCounts =  countSetBits(n);
        System.out.println("set bits :: " + bitCounts);
    }

    public static void initialize() {
        table[0] = 0;
        for(int i = 1; i < 256; i++) {
            table[i] = table[i & (i-1)] + 1;
        }
    }

    /*
     * This ligic is the most efficient solution for this particular task
     * TC : O(1)
     */
    public static int countSetBits(int n) {
        System.out.println("Table Solution ::");
        return table[n & 255] +
                table[(n >> 8) & 255] +
                table[(n >> 16) & 255] + 
                table[(n >> 24) & 255];
    }
    
    

}
