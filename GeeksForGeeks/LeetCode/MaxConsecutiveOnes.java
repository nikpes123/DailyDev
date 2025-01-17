package LeetCode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count = 0;
        for(int i= 0; i < nums.length; i++){
            if (nums[i] == 1){
                count ++;
                max_count = Integer.max(count, max_count);
            } else {
                count = 0;
            }
        }
        return max_count;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        System.out.println(ones.findMaxConsecutiveOnes(new int[] {3,4,5,1,2}));
    }
}
