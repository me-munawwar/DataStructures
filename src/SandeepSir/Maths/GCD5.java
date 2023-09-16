package SandeepSir.Maths;

public class GCD5 {
    public static void main(String[] args) {
        int a = 15;
        int b = 60;
        printGCDMyMethod(a, b);
        printGCDBetter(a,b);
        euclideanGCd(a, b);
        euclideanOptimizedGCD(a,b);
    }

    /**
     *This is the brute force solution that I designed, seems worst because the loop will iterate till the Min(a,b)
     *
     * TC : Theta(a+b)
     */
    public static void printGCDMyMethod(int a , int b) {
        int min = Math.min(a, b);
        int gcd = 0;
        for(int i = 1; i <= min; i++) {
            if(a%i == 0 && b%i == 0) {
                gcd  = i;
            }
        }
        System.out.println("GCD Is :: " + gcd);
    }

    /*
     * This is better approach because it start the iteration in the reverse order, hence relatively lesser iterations would be required to reach the GCD
     * TC : O(a+b)
     */
    private static void printGCDBetter(int a, int b) {
        int result = Math.min(a, b);
        while(result > 0) {
            if(a%result == 0 && b%result == 0) {
                break;
            }
            result--;
        }
        System.out.println("GCD Better :: " + result);
    }

    public static void euclideanGCd(int a , int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Euclidean GCD :: " + a);
    }

    /*
     * Eucliden algorithm says that gcd(num, 0) = num
     * Eucliden algorithm says that gcd(a, b) = gcd(b, a%b)
     */
    public static int euclideanOptimizedGCD(int a, int b) {
        if(b == 0) {
            System.out.println("Euclidean Optimized GCD :: " + a);
            return a;
        }
        return euclideanOptimizedGCD(b, a%b);
    }

    
}
