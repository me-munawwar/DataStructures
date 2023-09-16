package SandeepSir.BitMagic.classRoom.classroomPrograms;

/*
 * Task is to find the only odd occuring element from the provided array. Singular odd element is ensured
 */
public class OddOccuringElement {
   
    public static void main(String[] args) {
         int[] arr = {1,2,3,3,2,1,5,5,55};
         firstSolution(arr, arr.length);
         getOddOccuringElement(arr, arr.length);
    }

    /*
     * IDEA : XOR bitwise operator gives true output when compared bits are different
     * 4   : 100, 4^4 = 0
     * 5   : 101, 5^5 = 0
     * 4^5 : 001 -> 1
     * 
     * Also, 
     * 4^5 == 5^4 -> Commutative Property
     * x^y^z = z^x^y -> Associative Property
     * 
     * TC : Theta(n)
     */
    private static int getOddOccuringElement(int[] arr, int n) {
        System.out.println("Efficient Solution :: ");
        int result = arr[0];
        for(int i = 1; i < n; i++) {
            result ^= arr[i];
        }
        System.out.println("Odd Occuring Element :: " + result);
        return result;
    }

    /*
     * TC : O(n*n)
     */
    public static int firstSolution(int[] arr, int n) {
        System.out.println("Costly Solution :: ");
        int count = 0;
        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count%2 == 1) {
                System.out.println("Odd Occuring Element :: " + arr[i]);
                return arr[i];
            }
        }
        return 0;
    }
}
