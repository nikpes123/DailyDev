package BasicMaths;
/*
 * LeetCode Question #191: Number of 1 Bits
 * Difficulty: Easy
 *
 * Problem:
 * - Given an unsigned integer, return the number of '1' bits (Hamming Weight).
 *
 * Example 1:
 * Input: n = 11 (Binary: 1011)
 * Output: 3
 * Explanation:
 * The input binary string 1011 has three set bits (1s).
 *
 * Example 2:
 * Input: n = 128 (Binary: 10000000)
 * Output: 1
 * Explanation:
 * The input binary string 10000000 has one set bit (1).
 *
 * Example 3:
 * Input: n = 2147483645 (Binary: 1111111111111111111111111111101)
 * Output: 30
 * Explanation:
 * The input binary string has thirty set bits.
 *
 * Constraints:
 * - 0 <= n <= 2³¹ - 1 (Unsigned 32-bit integer)
 *
 */

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Add 1 if the last bit is set
            n >>>= 1; // Unsigned right shift
        }
        return count;
}
    public static void main(String[] args) {
        NumberOf1Bits bits = new NumberOf1Bits();
        System.out.println("Set bits in 11 (1011): " + bits.hammingWeight(11)); // Output: 3
        System.out.println("Set bits in 128 (10000000): " + bits.hammingWeight(128)); // Output: 1
        System.out.println("Set bits in 2147483645: " + bits.hammingWeight(2147483645)); // Output: 30
    }

}
