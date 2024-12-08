
public class SumOfFibRecur {
    public int getSumOfFib(int n){
        if (n == 1){
            return 1;
        }
        return n * getSumOfFib(n-1);
    }
    public static void main(String[] args) {
        SumOfFibRecur recur = new SumOfFibRecur();
        System.out.println(recur.getSumOfFib(5));
    }
}
