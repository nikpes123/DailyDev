package GeeksForGeeks;

public class SumOfAllDivisors {
    public int findSumOfDivisors(int n){
        int sum  = 0;
        for (int i = 1; i <= n; i++){
            sum += getSum(i);
        }
        return sum;
    }
    public int getSum(int n){
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // If i is a divisor
                sum += i;  // Add divisor i
                int k = n / i;
                if (i != k) {  // Avoid adding the square root twice (for perfect squares)
                    sum += n / i;  // Add the paired divisor n / i
                }
            }
        }
        return sum;
    
    }

    public int optimalApproach(int n){
        int sum = 0;

        // Iterate over each integer i from 1 to n
        for (int i = 1; i <= n; i++) {
            // Add i to the sum of divisors for all of its multiples
            sum += (n / i) * i;
        }
    
        return sum;
    }
    public static void main(String[] args) {
        SumOfAllDivisors sumObj = new SumOfAllDivisors();
        System.out.println(sumObj.findSumOfDivisors(4));
    }
    
}
