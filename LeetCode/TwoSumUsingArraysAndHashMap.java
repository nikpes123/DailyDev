package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingArraysAndHashMap {
    public int[] twoSumUsingArrays(int[] nums, int target) {
        for (int i =0 ; i < nums.length; i++ ){
            int diff = target - nums[i];
            for (int j =0 ; j < nums.length; j++ ){
                if (nums[j] == diff && j != i){
                    return new int[]{i, j};
                }
            }
        }
        return new int [2];
    }
    public int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i]; // Calculate the difference
            if (map.containsKey(dif)) { // Check if the difference is already in the map
                return new int[]{map.get(dif), i}; // Return the indices of the two numbers
            }
            map.put(nums[i], i); // Add the current number and its index to the map
        }
        return new int[0];// Handle case where no solution is found
    }  
    public static void main(String[] args) {
        TwoSumUsingArraysAndHashMap onj = new TwoSumUsingArraysAndHashMap();
        System.out.println(Arrays.toString(onj.twoSumUsingArrays(new int[]{3,3}, 6)));
    }
    
}
