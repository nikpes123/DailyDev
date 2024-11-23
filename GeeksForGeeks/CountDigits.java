package GeeksForGeeks;

public class CountDigits {
    public int evenlyDivides(int n){
        int counter = 0;
        int remaining = n;
        while (remaining != 0){
            int digit =  remaining % 10;
            if (digit != 0){
                if ( n % digit == 0 ){
                    counter ++;
                }
            }
            remaining = remaining / 10;
        }
    return counter;
    }
    public static void main(String[] args) {
        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.evenlyDivides(12));
        System.out.println(countDigits.evenlyDivides(2446));
        System.out.println(countDigits.evenlyDivides(23));

    }
    
}
