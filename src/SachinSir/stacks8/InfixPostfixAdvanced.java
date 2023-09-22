package SachinSir.stacks8;

import java.util.Stack;

public class InfixPostfixAdvanced {
    public static void main(String[] args) {
        String infix = "a+(b*c+f)-d";
        String targetPostfix = "abc*f++d-";

        getPostfix(infix);
    }

    private static String getPostfix(String infix) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<Character>();

        for (char c : infix.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }

            } else {
                int precedence = precedence(c);
                while (!st.isEmpty() && precedence <= precedence(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.empty()) {
            sb.append(st.pop());
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    private static int precedence(char c) {
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
