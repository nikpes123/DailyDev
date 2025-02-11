package BasicMaths.Questions;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2; // Sum formula
        int actualSum = 0;

        // Compute the sum of all elements in nums
        for (int num : nums) {
            actualSum += num;
        }

        // Missing number is the difference
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        System.out.println(solution.missingNumber(new int[]{3, 0, 1})); // Output: 2
        System.out.println(solution.missingNumber(new int[]{0, 1}));    // Output: 2
        System.out.println(solution.missingNumber(new int[]{9,6,4,2,3,5,7,0,1})); // Output: 8
    }

}
