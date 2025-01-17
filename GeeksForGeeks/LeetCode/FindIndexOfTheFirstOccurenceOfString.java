package LeetCode;

import java.util.ArrayList;

public class FindIndexOfTheFirstOccurenceOfString {
    // LeetCode Question 28
    public int strStr(String haystack, String needle) {
        // Naive Pattern Matching
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            boolean found = true;
            if (haystack.charAt(i) == needle.charAt(0)){
                for (int j = 1; j < needle.length(); j++){
                    if (haystack.charAt(i+j) != needle.charAt(j)){
                        found = false;
                        break;
                    } 
                }
                if (found){
                    return i;
                }
            }
        }
        return -1;
    }
    static void constructLps(String pat, int[] lps) {
        
        // len stores the length of longest prefix which 
        // is also a suffix for the previous index
        int len = 0;

        // lps[0] is always 0
        lps[0] = 0;

        int i = 1;
        while (i < pat.length()) {
            
            // If characters match, increment the size of lps
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            
            // If there is a mismatch
            else {
                if (len != 0) {
                    
                    // Update len to the previous lps value 
                    // to avoid redundant comparisons
                    len = lps[len - 1];
                } 
                else {
                    
                    // If no matching prefix found, set lps[i] to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static int search(String pat, String txt) {
        // The most efficient solution for this problem is to use the Knuth-Morris-Pratt (KMP) algorithm,
        //  which preprocesses the needle string to build a partial match table (also known as the "prefix table").
        //  This table allows the algorithm to skip unnecessary comparisons in the haystack.
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        constructLps(pat, lps);

        // Pointers i and j, for traversing 
        // the text and pattern
        int i = 0;
        int j = 0;

        while (i < n) {
            // If characters match, move both pointers forward
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;

                // If the entire pattern is matched 
                // store the start index in result
                if (j == m) {
                    return (i-j);
                    // res.add(i - j);
                    
                    // // Use LPS of previous index to 
                    // // skip unnecessary comparisons
                    // j = lps[j - 1];

                }
            }
            // If there is a mismatch
            else {
                
                // Use lps value of previous index
                // to avoid redundant comparisons
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        String txt = "sadbutsad"; 
        String pat = "but"; 

        int res = search(pat, txt);
        System.out.println(res);
    }

}
