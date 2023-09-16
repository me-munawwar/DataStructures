package SachinSir.prefixSum_recursion3;

public class PreciseSquareRootUsingBinary {
    public static void main(String[] args) {
        int n = 23;
        int precision = 5;

        double result = preciseSquareRootUsingBinarySearch(n, precision);
        System.out.println("Result :: " + result);
    }

    /*
     * TC : O(logn + log(Math.pow(10, precision))) -> O(logn + p) -> O(logn)
     * log(Math.pow(10, precision)) = precision*log10 = precision
     * 
     * SC : O(1)
     */
    private static double preciseSquareRootUsingBinarySearch(int n, int precision) {
        int integralPart = integralPartOfSquareRoot(n);
        System.out.println("Integral part :: " + integralPart);

        double l = integralPart;
        double r = l + 1;
        double mid = 0.0;
        double result = 0.0;
        double prec = Math.pow(10, -precision);
        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid <= n) {
                result = mid;
                l = mid + prec;
            } else {
                r = mid - prec;
            }
        }
        return result;
    }

    /*
     * TC : O(logn)
     */
    private static int integralPartOfSquareRoot(int n) {
        int l = 0;
        int r = n - 1;
        int mid;
        int integralPart = 0;

        while (l <= r) {
            mid = (l + r) / 2;
            if (mid * mid <= n) {
                integralPart = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return integralPart;
    }
}
