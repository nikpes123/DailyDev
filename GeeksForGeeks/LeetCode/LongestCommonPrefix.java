package LeetCode;

public class LongestCommonPrefix {
    // Leetcode Question 14
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;
        while(index < strs[0].length()){
            char prefix = strs[0].charAt(index);
            for(int i = 1; i < strs.length; i++){
                if (index >= strs[i].length() || prefix != strs[i].charAt(index)){
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }

}
