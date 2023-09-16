package SandeepSir.Maths;

public class AllDivisor9 {
    public static void main(String[] args) {
        int n = 100;
        /*
         * 15 -> 1,3,5,15
         * 26 -> 1,2,13,26
         */
        firstSolution(n);
        secondSolution(n);
        thirdSolution(n);
    }

 

    /*
     * TC : Theta(n)
     */
    public static void firstSolution(int n) {
        System.out.println("First Solution :: ");
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i);
            }
        }
    }

    private static void secondSolution(int n) {
        System.out.println("Second solution :: ");
        for(int i = 1; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }

    /*
     * TC : Theta(SQRT(n))
     */
    private static void thirdSolution(int n) {
        System.out.println("Third solution :: ");
        // n=10
        int i;
        for(i = 1; i*i < n; i++) {
            if(n%i == 0) {
                System.out.println(i);
                // 1,2,
            }
        }
        for(; i >= 1; i--) {
            if (n%i == 0) {
                // 5, 10
                System.out.println(n/i);
            }
        }
    }
}

