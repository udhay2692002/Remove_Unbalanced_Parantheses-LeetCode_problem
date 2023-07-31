import java.util.*;

public class q7 {

    public static String removeUnbalancedParentheses(String str) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(')
            {
                stack.push(i);
            }
            else if (ch == ')')
            {
                if (!stack.isEmpty())
                {
                    stack.pop();
                } else {
                    // Unbalanced closing parenthesis, skip it
                    continue;
                }
            }
            result.append(ch);
        }

        // Remove any unbalanced opening parentheses
        while (!stack.isEmpty()) {
            int index = stack.pop();
            System.out.println(index);
            result.deleteCharAt(index);
        }


        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(abc)) ((de))";
        String output = removeUnbalancedParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);


    }
}
