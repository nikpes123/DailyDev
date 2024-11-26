package GeeksForGeeks;

public class Print1ToN {
    int count = 1;
    public void printNos(int n){
        if (n <= 0){
            return;
        }
        printNos(n - 1);  // Print smaller numbers first
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Print1ToN printObj = new Print1ToN();
        printObj.printNos(10);
    }
    
}
