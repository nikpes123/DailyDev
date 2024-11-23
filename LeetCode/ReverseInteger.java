package LeetCode;

public class ReverseInteger {
    public static int reverse_integer(int x){
        int reversed = 0;
        while (x != 0){
            int digit = x % 10;
            x /= 10;
            // Check for potential overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Positive overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Negative overflow
            }
            reversed = reversed*10 + digit;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int input = 1534236469;
        // ReverseInteger obj = new ReverseInteger();
        // System.out.println(obj.reverse_integer(input));
        // System.out.println();
    }
}




// if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
//     System.out.println("The number is out of the range [-2^31, 2^31 - 1].");
// }