

public class PrintNTo1{
    public void print(int n){
        if (n > 0){
            System.out.print(n + " ");
            print(n-1);
        } else {
            return;
        }
    }
    public static void main(String[] args) {
        PrintNTo1 print1 = new PrintNTo1();
        print1.print(10);
    }
}
