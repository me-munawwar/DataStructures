package SandeepSir.Maths;

import java.util.Arrays;

public class AllPrimesUntil10 {
    
    public static void main(String[] args) {
        int num = 100;
        firstSolution(num);
        sievesSolution(num);
        sievesBestSolution(num);
    }

    /*
     * TC : Theta(num)
     */
    private static void firstSolution(int num) {
        System.out.println("First Solution :: ");
        for(int i = 2; i <= num; i++) {
            if(IsPrime7.isPrimeBest(i)) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    private static void sievesSolution(int num) {
        System.out.println("Sieve's Solution :: ");
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= num; i++) {
            if(isPrime[i]) {
                for(int j = 2*i; j <= num; j +=i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= num; i++) {
            if(isPrime[i]) {
                System.out.print(i + ", ");
            }
        }
    }

    private static void sievesBestSolution(int num) {
        System.out.println();
        System.out.println("Sieve's Best Solution :: ");
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= num; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j <= num; j +=i) {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= num; i++) {
            if(isPrime[i]) {
                System.out.print(i + ", ");
            }
        }
    }
}
