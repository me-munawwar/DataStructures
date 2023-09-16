package SandeepSir.Maths;

public class IsPrime7 {
    public static void main(String[] args) {
            int num = 55;
            // isPrimeOld(num);
            isPrimeBest(num);
    }

   
    /*
     * TC : O(num)
     */
    private static boolean isPrimeOld(int num) {
        int itr = 0;
        if(num == 1){
           return false;
        }
        for(int i = 2; i < num; i++) {
             itr++;
            if(num % i == 0) {
              return false;
            }
        }
         System.out.println("old itr :: " + itr);
        return true;
    }

    /*
     * Divisors always appear in pairs,
     * 30 = (x,y) -> (1,30), (2,15), (3,10), (5, 6), (10, 3), (30,1)
     * if x < n, then x*x <=n 
     * 
     * TC : O(SQRT(num))
     * TC : Theta(1) for 1, multiples of 2 & 3, and numbers lesser than 25
     */
    public static boolean isPrimeBest(int num) {
      // num = 49
        if(num == 1) {
           return false;
        }

        if(num == 2 || num == 3) {
           return true;
        }

        if(num%2 == 0 || num%3 == 0) {
           return false;
        }
        for(int i = 5; i*i <= num; i += 6) {
            if(num%i == 0 || num % (i+2) == 0){
               return false;
            }
        }
        return true;
    }


}
