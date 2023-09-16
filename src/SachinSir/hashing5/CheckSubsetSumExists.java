package SachinSir.hashing5;

public class CheckSubsetSumExists {
    public static void main(String[] args) {
        int sum = 5000;
        int[] set = { 3, 4, 34, 4, 12, 5, 2 };
        boolean sumSetSumExists = subSetSumExists(set, sum);
        boolean sumSetSumExistsBetter = subSetSumExistsBetter(set.length, sum, set);
        System.out.println(sumSetSumExistsBetter);

    }

    private static boolean subSetSumExistsBetter(int n, int sum, int[] set) {

        if (sum == 0) {
            return true;
        }

        if (sum > 0 && n == 0) {
            return false;
        }

        if (set[n - 1] > sum) {
            return subSetSumExistsBetter(n - 1, sum, set);
        }

        return subSetSumExistsBetter(n - 1, sum - set[n - 1], set) || subSetSumExistsBetter(n - 1, sum, set);

    }

    /*
     * TC : O(n*n)
     */
    private static boolean subSetSumExists(int[] set, int sum) {
        if (sum == 0) {
            return true;
        }

        if (sum > 0 && set.length == 0) {
            return false;
        }
        for (int i = 0; i < set.length; i++) {
            int currentSubsetSum = set[i];
            for (int j = i + 1; j < set.length; j++) {
                currentSubsetSum += set[j];
                if (currentSubsetSum == sum) {
                    System.out.println(i + ", " + j);
                    return true;
                }
            }
        }
        return false;
    }
}
