package practice.heaps;

import java.util.Arrays;

public class RearrangeCharacters {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] counter = new int[256];
        int maxOccured = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = (int) c;
            counter[index]++;
            maxOccured = Math.max(maxOccured, counter[index]);
        }

        StringBuilder sb = new StringBuilder();
        while (maxOccured > 0) {
            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 0) {
                    char c = (char) i;
                    sb.append(c);
                    counter[i]--;
                }
            }
            maxOccured--;
        }
        System.out.println(sb.toString());
    }
}