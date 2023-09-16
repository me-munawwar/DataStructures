package SandeepSir.recursion.classroomPrograms;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        int ropeLength = 1;
        int validSize1 = 2;
        int validSize2 = 3;
        int validSize3 = 5;
        int maxCount = cutRopeToMaximizeCount(ropeLength, validSize1, validSize2, validSize3);
        System.out.println("Max Pieces :: " + maxCount);
    }

    /*
     * Tc : O(pow(3,n))
     */
    private static int cutRopeToMaximizeCount(int ropeLength, int validSize1, int validSize2, int validSize3) {
        if (ropeLength == 0) {
            return ropeLength;
        }

        if (ropeLength < 0) {
            return -1;
        }

        int result = RopeCuttingProblem.max(
                cutRopeToMaximizeCount(ropeLength - validSize1, validSize1, validSize2, validSize3),
                cutRopeToMaximizeCount(ropeLength - validSize2, validSize1, validSize2, validSize3),
                cutRopeToMaximizeCount(ropeLength - validSize3, validSize1, validSize2, validSize3));
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    private static int max(int a, int b, int c) {
        int maxTemp = Math.max(a, b);
        return Math.max(maxTemp, c);
    }
}
