
public class Palindrome {
    public boolean isPalindrome(int x){
        String reversed_input = "";
        String input_str = Integer.toString(x);
        for (int i = input_str.length()-1; i >= 0; i--){
            reversed_input += input_str.charAt(i);
        }
        // System.out.println(reversed_input);
        // System.out.println(input_str);
        if (reversed_input.equals(input_str)){
            return true;
        }
        return false;
    }
    public boolean isPalindrome1(int x){
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed; 
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
    }
}
