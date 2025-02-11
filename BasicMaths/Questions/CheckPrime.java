package BasicMaths.Questions;

public class CheckPrime {
    /**
     * This method checks whether a given integer `n` is a prime number.
     * 
     * A prime number is a number greater than 1 that is divisible only by 1 and itself. 
     * To optimize the check, the method iterates from 2 to the square root of `n` 
     * because any factor greater than the square root would already have a corresponding 
     * factor below the square root.
     * 
     * Example:
     * - Input: n = 7
     * - Process: 
     *      - Check divisors from 2 to sqrt(7) (~2.64).
     *      - No divisors found, so 7 is prime.
     * - Output: true
     * 
     * - Input: n = 9
     * - Process: 
     *      - Check divisors from 2 to sqrt(9) (3).
     *      - Divisor 3 found (9 % 3 == 0), so 9 is not prime.
     * - Output: false
     * 
     * Parameters:
     * @param n The integer to be checked for primality.
     * @return true if the number is prime, false otherwise.
     */

    public Boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPrime p = new CheckPrime();
        System.out.println(p.isPrime(7));
    }   
}
