package LeetCode;

import java.util.Arrays;

public class SubarraySumEqualsK {
    public int subarraySumONSquare(int[] nums, int k) {
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
    public int subarraySum(int[] nums, int k) {
        int [] left_arr = new int[nums.length];
        left_arr [0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            left_arr[i] = left_arr[i-1] + nums[i];
        }
        int [] right_arr = new int[nums.length];
        right_arr [nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--){
            right_arr[i] = right_arr[i+1] + nums[i];
        }
        System.out.println(Arrays.toString(left_arr));
        System.out.println(Arrays.toString(right_arr));

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (left_arr[i] == k){
                count ++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (right_arr[i] == k){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK sumObj = new SubarraySumEqualsK();
        System.out.println(sumObj.subarraySum(new int[] {1,2,1,2,1}, 3));
    }
}
