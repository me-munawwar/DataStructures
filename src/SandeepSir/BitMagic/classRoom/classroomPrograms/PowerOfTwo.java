package SandeepSir.BitMagic.classRoom.classroomPrograms;

/*
 * Find if the given number is power of 2 or not
 * n = 2, Yes
 * n = 4, Yes
 * n = 6, No
 * n = 8, Yes
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        isPowerOfTwo(n);
        bestSolution(n);

    }

    /*
     * TC : O(logn)
     */
    private static boolean isPowerOfTwo(int n) {
        System.out.println("Solution 1 :: ");
        if(n == 0 || n%2 != 0) {
            System.out.println("Not a power of two :: " );
            return false;
        }
        while (n != 1) {
          
            if(n%2 != 0) {
                System.out.println("Not a power of two :: " +  n);
                return false;
            }
            n /= 2;
        }
        System.out.println("Power of two :: " );
        return true;
    }

    /*
     * IDEA : All the powers of two have only one set bit, let's make it zero by subtracting one. And check if the result is Zero
     * n = 4 : 100
     * x = 3 : 011
     * n & x : 000
     * 
     * n & (n - 1) == 0 Iff n is power of Two
     * 
     * TC : Theta(1)
     */
    private static boolean bestSolution(int n) {
        System.out.println("Solution 2 :: ");
        if(n == 0) {
            System.out.println("Not a power of Two :: " );
            return false;
        }
        boolean result =  (n & (n - 1)) == 0;
        if(result) {
            System.out.println("Power of two :: " );
        } else {
            System.out.println("Not a power of two :: " );
        }
        return result;
    }

}
