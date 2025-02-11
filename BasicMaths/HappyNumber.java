package BasicMaths;

/*
 * LeetCode Question # 202 (Happy Number)
 * Difficulty: Easy
 *
 * A Happy Number is a number defined by the following process:
 * - Starting with any positive integer, replace the number with the sum of the squares of its digits.
 * - Repeat the process until the number equals 1 (where it will stay), or it enters a cycle.
 * - Numbers that eventually reach 1 are "happy numbers."
 * - Numbers that fall into a cycle (not reaching 1) are "unhappy numbers."
 *
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 *   1² + 9² = 82
 *   8² + 2² = 68
 *   6² + 8² = 100
 *   1² + 0² + 0² = 1 (Happy Number)
 *
 * Example 2:
 * Input: n = 2
 * Output: false
 *
 * Constraints:
 * - 1 <= n <= 2³¹ - 1
 *
 * This program determines if a number is a Happy Number.
 */

 import java.util.HashSet;

 class HappyNumber{
     /**
      * Determines if a number is a "Happy Number".
      *
      * @param n The input number.
      * @return True if the number is happy, false otherwise.
      */
     public boolean isHappy(int n) {
         HashSet<Integer> seen = new HashSet<>(); // Stores numbers to detect cycles
 
         // Loop until we reach 1 (happy number) or detect a cycle (unhappy number)
         while (n != 1 && !seen.contains(n)) {
             seen.add(n);  // Mark number as seen
             n = getSumOfSquares(n); // Compute sum of squares of digits
         }
 
         // If n becomes 1, it's a happy number; otherwise, it's stuck in a cycle
         return n == 1;
     }
 
     /**
      * Computes the sum of the squares of the digits of a number.
      *
      * @param n The input number.
      * @return The sum of the squares of its digits.
      */
     private int getSumOfSquares(int n) {
         int sum = 0;
         while (n > 0) {
             int digit = n % 10;  // Extract last digit
             sum += digit * digit; // Square the digit and add to sum
             n /= 10;  // Remove last digit from the number
         }
         return sum;
     }
 
     public static void main(String[] args) {
        HappyNumber solution= new HappyNumber();
         System.out.println("Is 19 a happy number? " + solution.isHappy(19)); // true
         System.out.println("Is 2 a happy number? " + solution.isHappy(2));
     }
} 