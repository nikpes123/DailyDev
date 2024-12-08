

public class PrintGFGnTimes {
    public void printGFG(int n){
        if (n <= 0){
            return;
        }
        printGFG(n-1);
        System.out.print("GFG ");
    }
    public static void main(String[] args) {
        PrintGFGnTimes printObj = new PrintGFGnTimes();
        printObj.printGFG(10);
    }
}
