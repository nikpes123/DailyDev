package BasicMaths;

/**
 * Problem: Armstrong Number (Narcissistic Number)
 * 
 * An Armstrong number for a given number of digits is a number such that the
 * sum of its digits, each raised to the power of the number of digits, equals
 * the number itself.
 * 
 * Examples:
 * - 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 * - 9474 is an Armstrong number because 9^4 + 4^4 + 7^4 + 4^4 = 9474.
 */
public class ArmStrongNumbers {
    /**
     * Checks if a number is an Armstrong number.
     * 
     * @param a The number to check.
     * @return true if the number is an Armstrong number, false otherwise.
     */
    public boolean numCheck(int a) {
        if (a < 0) return false;
        int n = a;
        int total_digits = (int) Math.log10(n) + 1; // Calculate the number of digits
        int sum = 0;

        // Calculate the sum of each digit raised to the power of the number of digits
        for (int i = 0; i < total_digits; i++) {
            int remainder = n % 10; // Get the last digit
            n /= 10; // Remove the last digit
            sum += (int)Math.pow(remainder, total_digits); // Add the digit raised to the power of x
        }

        // Check if the calculated sum equals the original number
        return sum == a;
    }

    /**
     * Main method to test Armstrong number functionality.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        ArmStrongNumbers obj = new ArmStrongNumbers();
        // Test cases
        System.out.println(obj.numCheck(9474)); // Output: true (Armstrong number)
        System.out.println(obj.numCheck(153)); // Output: true (Armstrong number)
        System.out.println(obj.numCheck(9475)); // Output: false (Not an Armstrong number)
    }
}
