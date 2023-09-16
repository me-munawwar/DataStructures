package SandeepSir.BitMagic.classRoom.classroomPrograms;

public class PowerSetBitwise {
    public static void main(String[] args) {
        String s = "abc";
        printPowerSet(s, s.length());
    }

    static void printPowerSet(String str, int n) {
    	int powSize = (1 << n);
    	for(int counter = 0; counter < powSize; counter++) {
    		for(int j = 0; j < n; j++) {
    			if((counter & (1 << j)) != 0)
    				System.out.print(str.charAt(j));
    		}
    		System.out.println();
    	}
    }
}
