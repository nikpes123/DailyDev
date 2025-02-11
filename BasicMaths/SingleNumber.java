package BasicMaths;

/*
 * LeetCode Question #136: Single Number
 * Difficulty: Easy
 *
 * Given a non-empty array of integers `nums`, every element appears twice except for one.
 * Find that single element.
 *
 * You must implement a solution with:
 * - Linear runtime complexity: O(n)
 * - Constant extra space: O(1)
 * 
 * Approach: Bitwise XOR (^)
 * - A number XORed with itself results in 0 (a ^ a = 0)
 * - A number XORed with 0 remains unchanged (a ^ 0 = a)
 * - XOR is commutative and associative, meaning the order does not matter.
 * - By XORing all numbers in the array, duplicate numbers cancel out, leaving the unique number.
 */

 public class SingleNumber {
    
    /**
     * Finds the single number using XOR.
     *
     * @param nums The input array of integers.
     * @return The element that appears only once.
     */
    public static int singleNumber(int[] nums) {
        int result = 0; // Initialize result to 0

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num; // Apply XOR operation
        }

        return result; // The remaining number is the unique one
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        // Print results
        System.out.println("Single number in [2,2,1]: " + singleNumber(nums1)); // Output: 1
        System.out.println("Single number in [4,1,2,1,2]: " + singleNumber(nums2)); // Output: 4
        System.out.println("Single number in [1]: " + singleNumber(nums3)); // Output: 1
    }
}
