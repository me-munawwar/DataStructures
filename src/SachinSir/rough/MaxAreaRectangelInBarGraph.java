package SachinSir.rough;

public class MaxAreaRectangelInBarGraph {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 5, 9 };

        maxRectangleAreaInBarGraph(arr, arr.length);
    }

    private static void maxRectangleAreaInBarGraph(int[] arr, int n) {
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = 1;

            // right check
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    width++;
                } else {
                    break;
                }
            }

            // left check

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    width++;
                } else {
                    break;
                }
            }

            maxArea = Math.max(maxArea, arr[i] * width);

        }

        System.out.println(maxArea);
    }
}
