package SandeepSir.recursion.classroomPrograms;

public class FloorLogNToBaseX {
    public static void main(String[] args) {
        int n = 200;
        int x = 2;
        /*
         * Find what power of two is 16
         * 
         * In general -> this method finds out the floor of Log(N) to the base the number is devided in every iteration
         * 
         * Ex : if recursiverly n/3, and n = 27, output : 3
         * if recursiverly n/3, and n = 25, output : 2 
         */
        System.out.println(logOfNToTheBaseX(n, x));
        System.out.println(logOfNToTheBaseXBetter(n, x));
    }

    /*
     * TC : O(logn)
     */
    private static int logOfNToTheBaseX(int n, int x) {
        if(n == 1) {
            return 0;
        }
        return 1 + logOfNToTheBaseX(n/x, x);
    }

    /*
     * This is better solution because the base case will handle all test cases
     * 
     * try both programs for n = 200, x = 3
     */
    private static int logOfNToTheBaseXBetter(int n, int x) {
        if(n < x) {
            return 0;
        }
        return 1 + logOfNToTheBaseXBetter(n/x, x);
    }
}
