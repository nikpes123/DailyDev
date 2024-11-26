

public class CountNoOfDigitsInAnInteger {
    public int count(int n){
        int count = (int)Math.log10((double) n) +1;
        return count;
    }
    public static void main(String[] args) {
        CountNoOfDigitsInAnInteger ojb = new CountNoOfDigitsInAnInteger();
        System.out.println(ojb.count(1461661));
    }
}
