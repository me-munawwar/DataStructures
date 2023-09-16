package SandeepSir.Maths;

public class LCM6 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18; 
        myLCM(a,b);
        gfgFirstLCMSolution(a,b);
        bestApproachForLCM(a, b);

    }

    /*
     * LCM cannot be greater than the product of these numbers, ie. a * b
     * LCM = a*b, if both a & b are prime numbers
     */
    private static void myLCM(int a, int b) {
        int max = Math.max(a, b);
        while (max <= a*b) {
       
            if (max % a == 0 && max % b == 0) {
                break;
            }
            max++;
        }
        System.out.println("My LCM Solution :: " + max);
    }

    /*
     * TC : O(a*b - Max(a,b))
     * max iteration for prime numbers, least iterations, ie. 1 if numbers are same
     */
    private static void gfgFirstLCMSolution(int a, int b) {
        int result = Math.max(a, b);
        int itr = 0;
        while(true){
            System.out.println("itration count :: " + ++itr);
            if (result%a == 0 && result%b == 0) {
                break;
            }
            result++;
        }
        System.out.println("GFG First Solution for LCM :: " + result);
    }

    /*
     * Fact : gcd * lcm = a*b
     * Therefore, lcm = (a*b) / gcd
     */
    private static void bestApproachForLCM(int a, int b) {
        int product = a*b;
        int lcm = product/GCD5.euclideanOptimizedGCD(a,b);
        System.out.println("Best Approach, LCM :: " + lcm);
    }
}
