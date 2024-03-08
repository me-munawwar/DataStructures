package SachinSir.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StepsToMakeAnagram {
    public static void main(String[] args) {
        String s1 = "ddcf";
        String s2 = "deck";

        // manipulate s2 to make it anagram

        int steps = stepsToMakeAnagram(s1, s2);
        System.out.println("STEPS : " + steps);
    }

    /*
     * TC : O(s1.length() + s2.length())
     */
    private static int stepsToMakeAnagram(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        Set<Character> charSet = new HashSet<>();
        int steps = 0;
        for (char c : s1.toCharArray()) {
            charSet.add(c);
        }

        for (char c : s2.toCharArray()) {
            charSet.add(c);
        }

        System.out.println("charSet : " + charSet.toString());
        for (char c : s1.toCharArray()) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            }
            map1.putIfAbsent(c, 1);
        }

        for (char c : s2.toCharArray()) {
            if (map2.containsKey(c)) {
                map2.put(c, map1.get(c) + 1);
            }
            map2.putIfAbsent(c, 1);
        }

        System.out.println("MAP1 : " + map1.toString());
        System.out.println("MAP2 : " + map2.toString());

        for (char c : charSet) {
            if (map1.getOrDefault(c, 0) > map2.getOrDefault(c, 0)) {
                steps += map1.getOrDefault(c, 0) - map2.getOrDefault(c, 0);
                System.out.println("increasing steps, " + c + " : " + steps);
            }
        }

        return steps;
    }
}
