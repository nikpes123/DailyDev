package GeeksForGeeks;
public class Palindrome {
    public boolean isPalindrome(int x){
        int input = x;
        int reversed = 0;
        while (input != 0){
            int digit = input % 10;
            input /= 10;
            reversed = reversed*10 + digit;
        }
        if (reversed == x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
    }
}
