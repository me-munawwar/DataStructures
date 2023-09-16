package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 15;
        
        /*
         * The task is to find the number of bits set for a number
         * 15 -> 1111, RETURN: 4
         * 8 -> 1000, RETURN : 1
         */
        mySolution(n);
        enhancedSolution1(n);
        bestSolution(n);
    }

  

    /*
     * Dividing a number by 2 is equivalent to right shift by one bit.
     * IDEA :: Right shift all bits of a number one by one and check if the last bit is set or not, increase the count if yes;
     * 
     * TC : Theta(k)
     */
    private static int mySolution(int n) {
        System.out.println("My solution :: ");
        int count = 0;
        while(n > 0) {
            if((n&1) != 0) {
                count++;
            }
            n /= 2;
        }
        System.out.println("Count :: " + count);
        return count;
    }

    /*
     * This implement avoids if statement by harnesing the power of bitwise AND
     * 
     * TC : Theta(logn)
     */
    private static int enhancedSolution1(int n) {
        System.out.println("Enhnaced solution :: ");
        int count = 0;
        while(n > 0) {
            count += (n&1);
            n /= 2;
        }
        System.out.println("Count :: "+count);
        return count;
    }


    /*
     * IDEA : The logic is to set the last-set-bit to zero, this can be achived by (number - 1)
     * 
     * n       = 40 -> 101000
     * n - 1   = 39 -> 100111
     * n&(n-1) = 32 <- 100000
     * 
     * TC : Theta(setBits) 
     */
    public static int bestSolution(int n) {
        System.out.println("Best Solution :: ");
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("Count :: " + count);
        return count;
    }

    
}
