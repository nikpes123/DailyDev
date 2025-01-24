package BasicMaths;

/*
 * LeetCode Question # 7
 * Difficulty: Medium
 * 
 * This method reverses the digits of a signed 32-bit integer `x`. 
 * If the reversed integer goes outside the signed 32-bit range [-2^31, 2^31 - 1],
 * the method returns 0 to prevent overflow.
 *
 * Key Logic:
 * - Extract the last digit of `x` using `x % 10` and append it to the reversed number.
 * - Use `x /= 10` to remove the last digit of the original number.
 * - Before appending, check for potential overflow using the constraints of 32-bit integers:
 *   - Positive overflow: `reversed > Integer.MAX_VALUE / 10` or (on the last step) `digit > 7`.
 *   - Negative overflow: `reversed < Integer.MIN_VALUE / 10` or (on the last step) `digit < -8`.
 *
 * Example 1:
 * - Input: x = 123
 * - Process: 
 *      - Extract digits: 3, 2, 1
 *      - Reverse: 321
 * - Output: 321
 * 
 * Example 2:
 * - Input: x = -123
 * - Process:
 *      - Extract digits: -3, -2, -1
 *      - Reverse: -321
 * - Output: -321
 *
 * Example 3 (Overflow Case):
 * - Input: x = 1534236469
 * - Process:
 *      - Reversed number exceeds 32-bit range during computation.
 * - Output: 0
*
 */
public class ReverseInteger {
    /* 
     * Parameters:
     * @param x The signed 32-bit integer to reverse.
     * @return The reversed integer if within the 32-bit range, otherwise 0.
     */

    public int reverse_integer(int x){
        int reversed = 0;
        while (x != 0){
            int digit = x % 10;
            x /= 10;
            // Check for potential overflow
            if (willOverflow(reversed, digit) || willUnderflow(reversed, digit)) {
                return 0;
            }
            reversed = reversed*10 + digit;
        }
        return reversed;
    }
    private boolean willOverflow(int reversed, int digit) {
        return (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7));
    }
    
    private boolean willUnderflow(int reversed, int digit) {
        return (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8));
    }
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse_integer(-1534236469));
        System.out.println();
    }
}
