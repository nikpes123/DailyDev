
public class SumOfN {
    public int sumOfNRecursion(int n){
        if (n < 0){
            return 0;
        }
        return n + sumOfNRecursion(n-1);
    }
    public int sumofNBetterApproach(int n){
        int sum = n*(n+1) / 2;
        return sum;
    }
    public static void main(String[] args) {
        SumOfN n = new SumOfN();
        System.out.println(n.sumOfNRecursion(7));
        System.out.println(n.sumofNBetterApproach(7));

    }
}
