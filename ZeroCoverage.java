public class ZeroCoverage {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 0 }, { 0, 1, 1 }, { 0, 0, 0 } };
        int row = mat.length;
        int col = mat[0].length;

        int result = getZeroCoverage(mat, row, col);
        System.out.println("Result : " + result);
    }

    public static int getZeroCoverage(int[][] mat, int row, int col) {
        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    // left
                    if (isValidCordinate(i, j - 1, row, col)) {
                        result = mat[i][j - 1] == 1 ? result++ : result;
                    }
                    // right
                    if (isValidCordinate(i, j + 1, row, col)) {
                        result = mat[i][j + 1] == 1 ? result++ : result;
                    }

                    // top
                    if (isValidCordinate(i - 1, j, row, col)) {
                        result = mat[i - 1][j] == 1 ? result++ : result;
                    }

                    // bottom
                    if (isValidCordinate(i + 1, j, row, col)) {
                        result = mat[i + 1][j] == 1 ? result++ : result;
                    }
                }

            }
        }
        return result;
    }

    public static boolean isValidCordinate(int i, int j, int row, int col) {
        return i >= 0 && j >= 0 && i < row && j < col;
    }
}
