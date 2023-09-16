package SachinSir.prefixSum_recursion3;

public class IsPerfectSquareUsingBinarySearch {
    public static void main(String[] args) {
        int n = 81;
        boolean b = isPerfectSquare(n);
        System.out.println("Result :: " + b);
    }

    /*
     * TC : O(logn)
     * 
     * Note : This is a better approach to find if the number is perfect square or
     * not, because all the previous know were taking the time complexity as
     * O(SQRT(n)) at least
     */
    private static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int l = 0;
        int r = n - 1;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid == n) {
                return true;
            } else if (mid * mid < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
