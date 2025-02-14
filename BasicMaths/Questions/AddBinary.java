package BasicMaths.Questions;

import java.math.BigInteger;

/**
 * LeetCode Question #67: Add Binary
 * Difficulty: Easy
 * 
 * This class provides a solution to the problem of adding two binary numbers 
 * represented as strings and returning the result as a binary string. The solution
 * utilizes Java's BigInteger class to handle the conversion and arithmetic operations,
 * which allows for the addition of binary numbers beyond the standard size limits of
 * primitive data types.
 */
public class AddBinary {
        public static String addBinary(String a, String b) {
        // Convert binary string a to a BigInteger
        BigInteger num1 = new BigInteger(a, 2);
        
        // Convert binary string b to a BigInteger
        BigInteger num2 = new BigInteger(b, 2);
        
        // Add num1 and num2
        BigInteger sum = num1.add(num2);
        
        // Convert the sum back to a binary string
        return sum.toString(2);
    }

    public static void main(String[] args) {
        String a = "1010"; // Binary representation of 10
        String b = "1011"; // Binary representation of 11
        
        // Perform binary addition
        String result = addBinary(a, b);
        
        System.out.println("Result of adding " + a + " and " + b + " is " + result);
        // Should output: Result of adding 1010 and 1011 is 10101 (which is 21 in decimal)
    }
}
