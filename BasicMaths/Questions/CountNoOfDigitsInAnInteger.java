package BasicMaths.Questions;


public class CountNoOfDigitsInAnInteger {
    /**
     * This method calculates the number of digits in a given integer `n` using logarithmic math.
     * 
     * The number of digits in a positive integer can be determined by taking the base-10 logarithm 
     * of the number and adding 1. The formula is:
     * - Number of digits = floor(log10(n)) + 1
     * 
     * Example:
     * - Input: n = 4700
     * - Process:
     *      - log10(4700) ≈ 3.672
     *      - Floor value: 3
     *      - Add 1: 3 + 1 = 4 (number of digits).
     * - Output: 4
     * 
     * Parameters:
     * @param n The integer whose number of digits needs to be calculated.
     * @return The total count of digits in the integer `n`.
     */

    public int count(int n){
        int count = (int)Math.log10((double) n) + 1;
        return count;
    }
    public static void main(String[] args) {
        CountNoOfDigitsInAnInteger ojb = new CountNoOfDigitsInAnInteger();
        System.out.println(ojb.count(4700));
    }
}
