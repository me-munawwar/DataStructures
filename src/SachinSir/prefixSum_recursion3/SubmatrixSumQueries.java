package SachinSir.prefixSum_recursion3;

import java.util.Arrays;

public class SubmatrixSumQueries {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4, 6 },
                { 5, 3, 8, 1, 2 },
                { 4, 6, 7, 5, 5 },
                { 2, 4, 8, 9, 4 }
        };

        int[][] Q = {
                { 0, 0, 1, 1 },
                { 2, 2, 3, 4 },
                { 1, 2, 3, 3 }
        };

        // bruteForceSubmatrixSum(mat, mat.length, Q, Q.length);
        optimalSolutionSubmatrixSum(mat, mat.length, Q, Q.length);

    }

    /*
     * TC : O(q*R*C)
     */
    private static void bruteForceSubmatrixSum(int[][] mat, int n, int[][] Q, int q) {
        for (int i = 0; i < q; i++) {
            int x1 = Q[i][0];
            int y1 = Q[i][1];
            int x2 = Q[i][2];
            int y2 = Q[i][3];

            int sum = 0;
            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    sum += mat[j][k];
                }
            }
            System.out.println(sum);
        }
    }

    private static void optimalSolutionSubmatrixSum(int[][] mat, int n, int[][] Q, int q) {
        System.out.println("Given Matrix");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        /*
         * Create 2D prefixSum Array
         */
        int row = mat.length;
        int col = mat[0].length;
        int[][] prefixSum = new int[n][mat[0].length];

        /*
         * Copy first row
         */

        for (int i = 0; i < col; i++) {
            prefixSum[0][i] = mat[0][i];
        }

        /*
         * Colum wise sum
         */

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + mat[i][j];
            }
        }
        System.out.println("Intermediate prefix sum Matrix");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(prefixSum[i]));
        }

        /*
         * Row wise sum
         */

        for (int i = 0; i < row; i++)
            for (int j = 1; j < col; j++)
                prefixSum[i][j] += prefixSum[i][j - 1];

        /*
         * Print final prefix sum matrix
         */
        System.out.println("Final Matrix :: ");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(prefixSum[i]));
        }

        sumQuery(prefixSum, Q);

    }

    /*
     * TC : O(1)
     */
    static int sumQuery(int aux[][], int[][] Q) {
        for (int i = 0; i < Q.length; i++) {
            int x1 = Q[i][0];
            int y1 = Q[i][1];
            int x2 = Q[i][2];
            int y2 = Q[i][3];

            // result is now sum of elements
            // between (0, 0) and (x2, y2)
            int res = aux[x2][y2];

            // Remove elements between (0, 0)
            // and (x1-1, y2)
            if (x1 > 0)
                res = res - aux[x1 - 1][y2];

            // Remove elements between (0, 0)
            // and (x2, y1-1)
            if (y1 > 0)
                res = res - aux[x2][y1 - 1];

            // Add aux[x1-1][y1-1] as elements
            // between (0, 0) and (x1-1, y1-1)
            // are subtracted twice
            if (x1 > 0 && y1 > 0)
                res = res + aux[x1 - 1][y1 - 1];

            System.out.println(res);
        }
        return Integer.MIN_VALUE;

    }

}
