package SandeepSir.Maths;

public class PowerComputation {
    public static void main(String[] args) {
        int x = 5;
        int n = 35;
        firstSolution(x, n);
        int betterSolution = betterSolution(x, n);
        System.out.println("Recursive Solution :: " + betterSolution);

        bestSolution(x, n);
    }

    /*
     * TC : Theta(n)
     */
    private static void firstSolution(int x, int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("First Solution :: " + result);
    }

    /*
     * TC : O(logn)
     * SC : O(logn)
     * 
     * 
     * IDEA : if (n == even ) -> result = power(x, n/2) * power(x, n/2)
     * otherwise, result = power(x, n/2) * x
     */
    public static int betterSolution(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        int temp = betterSolution(x, n/2);
        temp *= temp;

        if(n%2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }

    /*
     * TC : O(logn)
     * SC : O(1), WOW
     * REVISIT THIS LECTURE
     */
    public static void bestSolution(int x, int n) {
        int result = 1;
        while(n > 0) {
            if(n % 2 != 0) {
                result *= x;
            }
            x *=x;
            n /= 2;
        }
        System.out.println("Best Solution :: " + result);
    }
}
