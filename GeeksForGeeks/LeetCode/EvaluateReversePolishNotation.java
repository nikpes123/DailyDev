package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    // Leetcode ques: 150
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens){
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = 0;
                if (s.equals("+")){
                    result = num2 + num1;
                } else if (s.equals("-")){
                    result = num2 - num1;
                } else if (s.equals("/")){
                    result = num2 / num1;
                } else {
                    result = num2 * num1;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
