package BasicMaths;

import java.util.ArrayList;

/*
 * LeetCode Question # 507
 * Difficulty: Medium
*
 * A perfect number is a positive integer that is equal to the sum of its positive divisors,
 * excluding the number itself. For example:
 * - Input: num = 28
 * - Divisors: 1, 2, 4, 7, 14
 * - Sum: 1 + 2 + 4 + 7 + 14 = 28 (Perfect Number)
 * 
 * This program checks whether a given number is a perfect number.
 */

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        /**
         * This method checks if a given number is a perfect number.
         * 
         * @param num The input number to check.
         * @return true if the number is perfect, false otherwise.
         */
        int sum = 0;
        ArrayList<Integer> divisors = getDivisors(num);
        for (int i: divisors){
            sum += i;
        }
        return sum == num;
    }
    /**
     * This method calculates all divisors of a given number, excluding the number itself.
     * 
     * @param n The input number.
     * @return An ArrayList containing the divisors of the number.
     */
    public ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> lst = new ArrayList<>();
        if (n <= 1){
            return lst;
        }
        for(int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                lst.add(i);
                if (i != 1 && n / i != i && n / i != n) { // Exclude the number itself
                    lst.add(n / i);
                }
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        System.out.println("Input Number: " + Integer.toString(28) + " is " + obj.checkPerfectNumber(28) );
    }
}
