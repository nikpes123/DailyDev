package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] selection(int[][] myArray){
        int n = myArray.length;
        for(int i =  0; i < n; i++){
            int min = i;
            for (int j = i; j < n; j++){
                if(myArray[min][0] > myArray[j][0]){
                    min = j;
                }
            }
            int[] temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;
        }
        return myArray;
    }
    public int[][] merge(int[][] intervals){
        intervals = selection(intervals);
        List<int[]> ans = new ArrayList<int[]>();
        ans.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int [] previous = ans.get(ans.size()-1);
            if (intervals[i][0] <= previous[1]){
                previous[1] = Integer.max(previous[1], intervals[i][1]);
            } else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);

    }
    public static void main(String[] args) {
        MergeIntervals mI = new MergeIntervals();
        int[][] input_array = {{1,3},{8,10},{15,18},{2,6}};
        int[][] output = mI.merge(input_array);
        for (int[] out: output){
            System.out.println(Arrays.toString(out));
        }
        
    }
}