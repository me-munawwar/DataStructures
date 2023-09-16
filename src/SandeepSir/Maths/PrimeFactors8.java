package SandeepSir.Maths;

public class PrimeFactors8 {
    public static void main(String[] args) {
        int n = 49;
        primeFactors(n);
        primeFactorsBetter(n);
        primeFactorsEvenBetter(n);
        primeFactorsBest(n);
    }

    /*
     * TC: O()
     * this code doesn't serve the purpose for pure prime numbers
     */
    private static void primeFactors(int n) {
        System.out.println("Prime Factors :: ");
        for(int i = 1; i*i <= n; i++) {
            if(IsPrime7.isPrimeBest(i)) {
                if (n%i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    /*
     * 12 -> 2,2,3
     * 315 -> 3,3,5,7
     * 
     * TC : O(nlogn)
     */
    private static void primeFactorsBetter(int n) {
        // n = 12;
        System.out.println("Better prime factor :: ");
        for(int i = 2; i <= n; i++) {
            if(IsPrime7.isPrimeBest(i)) {
                while(n%i == 0) {
                    System.out.println(i);
                    n /= i;
                }
            }
        }
    }

    

    private static void primeFactorsEvenBetter(int n) {
        System.out.println("Prime factors even better :: ");
        if (n <= 1) {
            return;
        }
        for(int i = 2; i*i <= n; i++) {
            if(IsPrime7.isPrimeBest(n)) {
                while(n%i == 0) {
                    System.out.println(i);
                    n /= i;
                }
            }
        }
        if(n > 1) {
            System.out.println(n);
        }
    }



    /*
     * TC : O(SQRT(n))
     */
    private static void primeFactorsBest(int n) {
        System.out.println("Prime Factor Best");
        if(n <= 1) {
            return;
        }

        while (n%2 == 0) {
            System.out.println(2);
            n /= 2;
        }

        while(n%3 == 0) {
            System.out.println(3);
            n /= 3;
        }

        for(int i = 5; i*i <= n; i += 6) {
            if(IsPrime7.isPrimeBest(i)) {
                while (n%i == 0) {
                    System.out.println(i);
                    n /= i;
                }

                while (n%(i+2) == 0) {
                    System.out.println(i+2);
                    n /=(i+2);
                }
            }
        }
        if (n > 3) {
            System.out.println(n);
        }
    }
}
