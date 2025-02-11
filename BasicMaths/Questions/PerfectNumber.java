package BasicMaths.Questions;

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
        int sum = 1;
        if (num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                sum += i;
                if ((num / i) != i) { // Exclude the number itself
                    sum += (num / i);
                }
            }
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        System.out.println("Input Number: " + Integer.toString(28) + " is " + obj.checkPerfectNumber(28) );
    }
}
