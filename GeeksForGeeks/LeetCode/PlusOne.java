package LeetCode;

import java.util.Arrays;

public class PlusOne {
    // LeetCode Question 66
    public int[] plusOne(int[] digits) {
        for (int i =  digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning of the array
        int[] newDigits = new int[ digits.length + 1];
        newDigits[0] = 1;
        // The rest of the digits are automatically initialized to 0
        return newDigits;
    }
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        System.out.println(Arrays.toString(po.plusOne(new int[]{9,9,9})));
    }
}
