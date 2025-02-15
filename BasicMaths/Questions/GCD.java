package BasicMaths.Questions;

import java.util.Arrays;

/**
 * This class provides methods to calculate the Greatest Common Divisor (GCD) and the Least Common Multiple (LCM) 
 * of two integers using various approaches.
 */
public class GCD {
    
    /**
     * Calculates the GCD of two numbers using a brute-force approach.
     * 
     * @param n1 The first number.
     * @param n2 The second number.
     * @return The greatest common divisor of n1 and n2.
     */
    public int brute_force(int n1, int n2){
        int min_integer = Math.min(n1, n2); // Find the smaller of the two numbers to limit the loop.
        int current_max_factor = 1; // Initialize the largest factor found to 1.
        for (int i = 2; i <= min_integer; i++){ // Iterate from 2 to the smaller number.
            if ((n1 % i == 0) && (n2 % i == 0)){ // Check if i is a divisor of both n1 and n2.
                current_max_factor = i; // Update the largest factor found.
            }
        }
        return current_max_factor; // Return the largest factor.
    }

    /**
     * An improved approach to find the GCD by iterating backwards from the smaller number.
     * This method reduces the number of iterations compared to the brute force approach.
     * 
     * @param n1 The first number.
     * @param n2 The second number.
     * @return The greatest common divisor of n1 and n2.
     */
    public int betterApproach(int n1, int n2){
        int minInt = Math.min(n1, n2); // Find the smaller of the two numbers.
        for(int i = minInt; i > 0; i--){ // Iterate downwards from the smaller number.
            if (n1 % i == 0 && n2 % i == 0){ // Check if i is a divisor of both numbers.
                return i; // Return i as the GCD as soon as a common divisor is found.
            }
        }
        return 1; // Return 1 if no common divisor is found except 1.
    }

    /**
     * Calculates both the GCD and LCM using the Euclidean algorithm, which is an efficient way to find GCD.
     * 
     * @param n1 The first number.
     * @param n2 The second number.
     * @return An array containing the LCM and GCD of the two numbers.
     */
    public int[] Euclidean(int n1, int n2){
        int input1 = n1; // Preserve original n1.
        int input2 = n2; // Preserve original n2.
        if (n1 < n2){ // Ensure n1 is greater than n2 for the algorithm.
            int swap = n2;
            n2 = n1;
            n1 = swap;
        }
        int remainder = 0;
        while (n2 != 0){ // Continue until no remainder.
            remainder = n1 % n2; // Calculate remainder of n1 divided by n2.
            n1 = n2; // Update n1 to n2.
            n2 = remainder; // Update n2 to remainder.
        }
        int lcm = (int)((input1 * input2) / n1); // Calculate LCM using GCD.
        return new int[]{lcm, n1}; // Return both LCM and GCD.
    }

    public static void main(String[] args) {
        GCD gcf = new GCD();
        System.out.println(Arrays.toString(gcf.Euclidean(5, 10))); // Test the Euclidean method.
    }
}
