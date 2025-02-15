package Arrays.Questions;
public class CoveringNumber {
    public int covering_number(int n) {
        int[] digitCount = new int[10]; // Array to count occurrences of digits 0-9
        int totalDigits = 0;

        // Extract digits and count occurrences
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                totalDigits++;
            }
            digitCount[digit]++;
            n /= 10;
        }

        // Check if digits 1 to totalDigits appear exactly once
        for (int i = 1; i <= totalDigits; i++) {
            if (digitCount[i] != 1) {
                return -1;
            }
        }

        return digitCount[0];
    }

    public static void main(String[] args) {
        CoveringNumber cm = new CoveringNumber();
        System.out.println(cm.covering_number(1423));       // Output: 0
        System.out.println(cm.covering_number(12346500));   // Output: 2
        System.out.println(cm.covering_number(2001053));    // Output: -1
    }
}
