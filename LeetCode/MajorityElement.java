package LeetCode;

import java.util.Arrays;

public class MajorityElement {
    public void merge(int[] my_array, int left, int mid, int right){
        int n_left = mid-left +1; // we do +1 because we wish to include the mid element in the left array
        int n_right = right-mid; 
        int[] left_array = Arrays.copyOfRange(my_array, left, mid+1); 
        int[] right_array = Arrays.copyOfRange(my_array, mid+1, right+1); 
        int i =  0, j = 0, k = left;
        while (i < n_left && j < n_right){
            if (left_array[i] < right_array[j]){
                my_array[k++] = left_array[i++];
            } else {
                my_array[k++] = right_array[j++];
            }
        }
        while (i < n_left){
            my_array[k++] = left_array[i++];
        }
        while (j < n_right){
            my_array[k++] = right_array[j++];
        }
    }
    public void merge_sort(int[] my_array, int left, int right){
        if (left < right){
            int mid = left + (right-left) / 2; //mid could be left+right/2, but that may give an Overflow error when array is too large
            merge_sort(my_array, left, mid);

            merge_sort(my_array, mid+1, right);

            merge(my_array, left, mid, right);
        }
    }
    public int majorityElement(int[] nums) {
        merge_sort(nums, 0, nums.length-1);
        return nums[nums.length/2];

    }
}
