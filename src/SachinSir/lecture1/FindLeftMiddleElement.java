package SachinSir.lecture1;

public class FindLeftMiddleElement {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 8, 5, 5, 3, 8, 5, 5 };
        int x = 5;
        findMiddleElement(arr, arr.length, x);
        // findLeftMiddleElement(arr, arr.length, x);
    }

    private static void findMiddleElement(int[] arr, int n, int x) {
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                totalCount++;
            }
        }

        int currentCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                currentCount++;
            }
            if (currentCount == (totalCount + 1) / 2) {
                System.out.println(i);
                return;
            }
        }
    }
}
