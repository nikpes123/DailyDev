package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>(); // key will store sorted string and value will store all the original strings
        for (int i = 0; i < strs.length; i++){
            char[] char_arr = strs[i].toCharArray();
            merge_sort(char_arr, 0, char_arr.length -1);
            String key = new String(char_arr);
            if (map.containsKey(new String(char_arr))){
                ArrayList<String> currentList = map.get(key);
                currentList.add(strs[i]);
                map.put(key, currentList);
            } else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(key, newList);
            }
        }
        List<List<String>> finalList = new ArrayList<>();
        for (String key: map.keySet()){
            finalList.add(map.get(key));
        }
        return finalList;
    }
    public void merge_sort(char[] charArray, int low, int high){
        if (low < high){
            int mid = (low+high)/2;
            merge_sort(charArray, low, mid);
            merge_sort(charArray, mid+1, high);
            merge(charArray, low, mid, high);
        }
    }
    public void merge(char[] charArray, int low, int mid, int high){
        int n1 = mid-low +1; // we do +1 because we wish to include the mid element in the left array
        int n2 = high-mid; 
        char[] leftArr = Arrays.copyOfRange(charArray, low, mid+1);
        char[] rightArr = Arrays.copyOfRange(charArray, mid+1, high+1);
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2){
            if (leftArr[i] > rightArr[j]){
                charArray[k++] = rightArr[j++];
            } else {
                charArray[k++] = leftArr[i++];
            }
        }
        while (i < n1){
            charArray[k++] = leftArr[i++];
        }
        while (j < n2){
            charArray[k++] = rightArr[j++];
        }
    }
    public static void main(String[] args) {
        String[] strs  = new String[]{"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams ga = new GroupAnagrams();
        ga.groupAnagrams(strs);
    }

}
