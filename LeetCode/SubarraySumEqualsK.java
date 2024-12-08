package LeetCode;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = nums[i];
            if (sum == k){
                count += 1;
            } else {
                for (int j = i+1; j < nums.length; j++){
                    sum += nums[j];
                    if (sum == k){
                        count += 1;
                    }
                }
            }
        }
     return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK sumObj = new SubarraySumEqualsK();
        System.out.println(sumObj.subarraySum(new int[] {0,0}, 0));
    }
}
