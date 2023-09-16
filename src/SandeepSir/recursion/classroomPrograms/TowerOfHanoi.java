package SandeepSir.recursion.classroomPrograms;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int numDisks = 10; // Change this value to set the number of disks
        char sourceRod = 'A';
        char auxiliaryRod = 'B';
        char destinationRod = 'C';

        solveTowerOfHanoi(numDisks, sourceRod, auxiliaryRod, destinationRod);
        System.out.println("My solution :: ");
        System.out.println();
        mySolution(numDisks, sourceRod, auxiliaryRod, destinationRod);
    }

    public static void solveTowerOfHanoi(int numDisks, char sourceRod, char auxiliaryRod, char destinationRod) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + sourceRod + " to " + destinationRod);
            return;
        }

        solveTowerOfHanoi(numDisks - 1, sourceRod, destinationRod, auxiliaryRod);
        System.out.println("Move disk " + numDisks + " from " + sourceRod + " to " + destinationRod);
        solveTowerOfHanoi(numDisks - 1, auxiliaryRod, sourceRod, destinationRod);
    }

    public static void mySolution(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("move disk 1 from " + a + " to " + c);
            return;
        }
        mySolution(n - 1, a, c, b);
        System.out.println("move disk " + n + " from " + a + " to " + c);
        mySolution(n - 1, b, a, c);
    }
}
