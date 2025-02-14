package Arrays.Questions;

/*
 * LeetCode Question #27
 * Difficulty: Easy
 * Title: Remove Element
 * 
 * Description:
 * This program removes all instances of a specific integer value (`val`) from an array (`nums`) in place. 
 * The function `removeElement` modifies the array such that all elements not equal to `val` are moved to the 
 * front of the array. The function returns the number of elements in the modified array that are not equal to `val`.
 * 
 * Approach:
 * The function uses a two-pointer technique, where one pointer (`k`) keeps track of the index of the next 
 * non-`val` element in the array. As we iterate through the array, each time we find an element that isn't `val`, 
 * we place it at the index pointed to by `k` and then increment `k`. This effectively compresses all non-`val` elements
 * to the front of the array.
 *
 * The order of the non-`val` elements in the result is maintained as in the input array, and the elements after 
 * the first `k` elements in the array are not important and can be ignored or overwritten.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k += 1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        
    }
}
