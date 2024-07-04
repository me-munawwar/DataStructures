package zzPotd;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = mat.length;
        int col = mat[0].length;
        int k = 1;
        System.out.println("Original Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        rotate(mat, row, col, k);
    }

    private static int[][] rotate(int[][] mat, int row, int col, int k) {
        int result[][] = new int[row][col];
        k = k % (col + 1);
        if (k == 0) {
            return mat;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int newIndex = (j - k + col) % col;
                result[i][newIndex] = mat[i][j];
            }
        }

        System.out.println("Result Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return result;

    }
}
