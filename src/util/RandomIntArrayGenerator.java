package util;

import java.util.Random;

public class RandomIntArrayGenerator {

    public static void main(String[] args) {
        int maxSize = 12;
        int[] randomIntArray = generateRandomIntArray(maxSize);

        // Print the generated array
        System.out.println("Generated Random Integer Array:");
        for (int num : randomIntArray) {
            System.out.println(num);
        }
    }

    public static int[] generateRandomIntArray(int maxSize) {
        Random random = new Random();
        int arraySize = random.nextInt(maxSize); // Random size less than 12

        int[] randomIntArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randomIntArray[i] = random.nextInt(100);
        }

        return randomIntArray;
    }

}
