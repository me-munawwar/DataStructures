package SachinSir.stacks8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketBalancing {
    public static void main(String[] args) {
        String brackets = "{{{{[[(())]]}}}}";
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');
        bracketMap.put('>', '<');
        boolean b = doesBracketsMatch(bracketMap, brackets, brackets.length());
        System.out.println(b);

    }

    /*
     * TC : O(n)
     * SC : O(1)
     */
    private static boolean doesBracketsMatch(Map<Character, Character> bracketMap, String brackets, int n) {
        Stack<Character> st = new Stack<>();

        for (char ch : brackets.toCharArray()) {
            if (bracketMap.containsKey(ch)) {
                if (st.isEmpty() || st.pop() != bracketMap.get(ch)) {
                    return false;
                }

            } else {
                st.push(ch);
            }
        }
        System.out.println(st.size());
        return st.isEmpty();
    }

}
