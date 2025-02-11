package BasicMaths.Questions;

public class CountNoOfDigitsThatDivideEvenlyAnInteger {
    /**
     * This method calculates the number of digits in the given integer `n` 
     * that evenly divide the number `n` (ignoring zeros in the number).
     * A digit "evenly divides" `n` if `n % digit == 0` without leaving a remainder.
     *
     * Example:
     * - Input: n = 120
     * - Process: Check each digit: 
     *      - Digit 1: 120 % 1 == 0 (counts as 1)
     *      - Digit 2: 120 % 2 == 0 (counts as 1)
     *      - Digit 0: Ignored.
     * - Output: 2
     *
     * @param n The input integer to process.
     * @return The count of digits that evenly divide the number `n`.
     */

    public int evenlyDivides(int n){
        int count = 0;
        String numString = String.valueOf(n);
        int length = numString.length();

        for(int i = 0; i < length; i++){
            if (numString.charAt(i) != '0'){
                if (n % Character.getNumericValue(numString.charAt(i)) == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    public int evenlyDivides2(int n){
        int count = 0;
        int y = n;
        while (y > 0) {
            int x = y % 10;
            if(x !=0 && n % x == 0 ){
                count ++;
            }
            y = y/10;
        }
        return count;
    }
    public static void main(String[] args) {
        CountNoOfDigitsThatDivideEvenlyAnInteger ojb = new CountNoOfDigitsThatDivideEvenlyAnInteger();
        System.out.println(ojb.evenlyDivides(4700));
        System.out.println(ojb.evenlyDivides2(4700));
    }
}
