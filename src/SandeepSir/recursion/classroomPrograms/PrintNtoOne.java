package SandeepSir.recursion.classroomPrograms;

public class PrintNtoOne {
    public static void main(String[] args) {
        int n = 10;

        printNtoOne(n);
        
    }

    private static void printNtoOne(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }
}
