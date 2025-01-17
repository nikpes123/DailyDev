package LeetCode;

import java.util.ArrayList;

public class CountandSay {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String previous = countAndSay(n-1);
        ArrayList<ArrayList<Integer>> arr = helper1(previous);
        return helper2(arr);
        }

    public String helper2(ArrayList<ArrayList<Integer>> inputArrayList){
        String str = "";
        for (ArrayList<Integer> arr : inputArrayList){
            str += arr.get(1);
            str += arr.get(0);
        }
        return str;
    }
    // leetCode question No 38
    public ArrayList<ArrayList<Integer>> helper1 (String input){
        ArrayList<ArrayList<Integer>> rList = new ArrayList<>();
        char previous = input.charAt(0);
        int count = 1;
        for(int i = 1; i < input.length(); i++){
            if (previous == input.charAt(i)){
                count ++;
            } else {
                ArrayList<Integer> array = new ArrayList<>();
                array.add(Character.getNumericValue(previous));
                array.add(count);
                rList.add(array);
                previous = input.charAt(i);
                count = 1;
            }
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(Character.getNumericValue(previous));
        array.add(count);
        rList.add(array);
        return rList;
    }
    public static void main(String[] args) {
        CountandSay candSay = new CountandSay();
        ArrayList<ArrayList<Integer>> output = candSay.helper1("223314444411");
        for (ArrayList<Integer> arr: output){
            System.out.println(arr.toString());
        }
    }
}
