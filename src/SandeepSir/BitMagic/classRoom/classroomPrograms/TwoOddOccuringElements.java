package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class TwoOddOccuringElements {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,3,3,4,5,4,2,5};
        solve(arr, arr.length);
    }

    public static void solve(int[] arr, int n) {
        int result = arr[0];
        for(int i = 1; i < n; i++) {
            result ^= arr[i];
        }

        /*
         * Now, this result is XOR of two numbers, whose bits don't match, obviously
         */
        int k = result & (~(result - 1));
        int res1 = 0; 
        int res2 = 0;

        for(int i = 0; i < n; i++) {
            if((arr[i] & k) != 0) {
                res1 ^= arr[i];
            } else {
                res2 ^= arr[i];
            }
        }

        System.out.println("These numbers are :: " + res1 +" , " + res2);
        
    }
}
