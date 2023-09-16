package SachinSir.stacks8;

import java.util.Stack;

public class InfixPostfix {
    public static void main(String[] args) {
        String infix = "a+b*c+d";
        // String targetPostfix = "abc*+d+";

        String calculatedPostfix = calculatePostfix(infix, infix.length());
    }

    private static String calculatePostfix(String infix, int n) {
        StringBuffer sb = new StringBuffer();

        Stack<Character> st = new Stack<>();
        for (char c : infix.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                sb.append(c);
            } else {
                int prec = precedence(c);
                if (st.empty()) {
                    st.push(c);
                } else {
                    int stackTopPrecendece = precedence(st.peek());

                    while (stackTopPrecendece < prec) {
                        stackTopPrecendece = precedence(st.peek());
                        st.pop();
                    }
                }

            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }
}
