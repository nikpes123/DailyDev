package LeetCode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1]* nums[i-1];
        }
        int right_product = 1;
        for (int i = nums.length-2; i >=0 ; i--){
            right_product *= nums[i+1];
            answer[i] *= right_product;
        }        
        return answer;
    }
    public int[] productExceptSelfComplexityONSquare(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int product = 1;
            for (int j = 0; j < nums.length; j++){
                if (i != j){
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }
    public int[] productExceptSelfComplexityONSButUseless(int[] nums) {
        int product = 1;
        for (int num : nums){
            product *= num;
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            answer[i] = product / nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        ProductofArrayExceptSelf productObj = new ProductofArrayExceptSelf();
        System.out.println(Arrays.toString(productObj.productExceptSelfComplexityONSButUseless(new int[] {1, 2, 3, 4})));
    }
}