

import java.util.Arrays;

public class GCD{
    public int brute_force(int n1, int n2){
        int min_integer = Math.min(n1, n2);
        int current_max_factor = 1;
        int lcm = 1;
        for (int i = 2; i <= min_integer; i++){
            if ((n1 % i == 0) && (n2 % i == 0)){
                current_max_factor = i;
                
            }
        }
        return current_max_factor;
    }
    public int betterApproach (int n1, int n2){
        int minInt = Math.min(n1, n2);
        for(int i = minInt; i > 0; i--){
            if (n1 % i == 0 && n2 % i == 0){
                return i;
            }
        }
        
        return 1;
    }

    public int[] Euclidean(int n1, int n2){
        int input1 = n1;
        int input2 = n2;
        if (n1 < n2){
            int swap = n2;
            n2 = n1;
            n1= swap;
        }
        int remainder = 0;
        while (n2 != 0){
            remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int lcm = (int)((input1*input2) / n1);
        return new int[]{lcm, n1};
    }

    public static void main(String[] args) {
        GCD gcf = new GCD();
        System.out.println(Arrays.toString(gcf.Euclidean(5, 10)));
    }
}
