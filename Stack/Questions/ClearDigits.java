package Stack.Questions;

import java.util.Stack;

public class ClearDigits {
    public static String removeDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove the closest non-digit character to the left
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Remove the closest non-digit character
                }
            } else {
                stack.push(ch);
            }
        }

        // Construct the final string from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDigits("a1b2c3")); // Output: ""
        System.out.println(removeDigits("abc123")); // Output: ""
        System.out.println(removeDigits("ab12c3d")); // Output: "d"
        System.out.println(removeDigits("x5y6z")); // Output: ""
    }
}
