package Patterns;
public class Patterns {
    public void pattern1(int x){
        // *****
        // *****
        // *****
        // *****
        // *****
        String line = "*".repeat(x);
        for (int i = 0; i < x; i++){
            System.out.println(line);
        }
    }
    public void pattern2(int x){
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= x; i++){
            System.out.println("*".repeat(i));
        }
    }
    public void pattern3(int x){
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for (int i = 1 ; i <= x ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public void pattern4(int x){
        // 1 
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        for (int i = 1 ; i <= x ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.err.println();
            // System.out.println(Integer.toString(i).repeat(i));
        }
    }
    public void pattern5(int x){
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = x; i > 0 ; i--){
                System.out.println("*".repeat(i));
            }
    }
    public void pattern6(int n){
        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for (int i = n ; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public void pattern7(int n){
        //      *    
        //     ***
        //    *****
        //   *******
        //  *********
        for (int i = 0; i < n; i++){
            int spaces = n-i-1;
            System.out.print(" ".repeat(spaces));
            int stars = 2*i + 1;
            System.out.print("*".repeat(stars));
            System.out.print(" ".repeat(spaces));
            System.out.println("");
        }
    }
    public void pattern8(int n){
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for (int i = n-1; i >= 0; i--){
            int spaces = n-i-1;
            System.out.print(" ".repeat(spaces));
            int stars = 2*i + 1;
            System.out.print("*".repeat(stars));
            System.out.print(" ".repeat(spaces));
            System.out.println("");
        }
    }
    public void pattern9(int n){
        //      *    
        //     ***
        //    *****
        //   *******
        //  *********
         // *********
         //  *******
         //   *****
         //    ***
         //     *
        for (int i = 0; i < n; i++){
            int spaces = n-i-1;
            System.out.print(" ".repeat(spaces));
            int stars = 2*i + 1;
            System.out.print("*".repeat(stars));
            System.out.print(" ".repeat(spaces));
            System.out.println("");
        }
        for (int i = n-1; i >= 0; i--){
            int spaces = n-i-1;
            System.out.print(" ".repeat(spaces));
            int stars = 2*i + 1;
            System.out.print("*".repeat(stars));
            System.out.print(" ".repeat(spaces));
            System.out.println("");
        }
    }
    public void pattern10(int n){
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= 2*n -1; i++){
            int stars = i;
            if (i > n){
                stars = 2*n -i;
            }
            System.out.println("*".repeat(stars));
        }
    }
    public void pattern11(int n){
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for (int i = 0; i < n; i++){
            int start = 0;
            if (i % 2 == 0){
                start = 1;
            }
            for (int j = 0; j <= i; j++){
                System.out.print(start);
                start ^= 1;
            }
            System.out.println("");
        }
    }
    public void pattern12(int n){
        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(n-i));
            for (int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public void pattern13(int n){
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int start = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(start + " ");
                start ++;
            }
            System.out.println("");
        }
    }
    public void pattern14(int n){
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print((char) (j + 64));
            }
            System.out.println("");
        }
    }
    public void pattern15(int n){
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print((char) (j + 64));
            }
            System.out.println("");
        }
    }
    public void pattern16(int n){
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print((char) (i + 64));
            }
            System.out.println("");
        }
    }
    public void pattern17(int n){
    //      A
    //     ABA
    //    ABCBA
    //   ABCDCBA
        for (int i = 0; i < n; i++){
            System.out.print(" ".repeat(n-i + 1));
            for (int j = 0; j <= i; j++){
                System.out.print((char) (j + 65));
            }
            // System.out.print((char) ((i+1) + 64));
            for (int j =  i; j > 0; j--){
                System.out.print((char) (j + 64));
            }
            System.out.println("");
        }
    }
    public void pattern18(int n){
        char start_char = (char)(n+64);
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)(start_char + j));
            }
            start_char --;
            System.out.println("");
        }
    }
    public void pattern19(int n){
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        for (int i = n; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(n-i));
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(n-i));
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    public void pattern20(int n){
        // *      *
        // **    **
        // ***  ***
        // ********
        // ***  ***
        // **    **
        // *      *
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(n-i));
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n-1; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i); j++){
                System.out.print(" ");
            }
            // System.out.print(" ".repeat(n-i));
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void pattern21(int n){
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == 0 || j == (n-1) || i == 0 || i == (n-1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pattern22(int n){
            // 4444444
            // 4333334
            // 4322234
            // 4321234
            // 4322234
            // 4333334
            // 4444444
        for (int i = 0; i < 2*n-1; i++){
            for (int j = 0; j < 2*n-1; j++){
                int left = j - 0;
                int right = (2*n)- 2 -j;
                int up = i - 0;
                int down = (2*n)- 2 -i;
                int num = n - Math.min(Math.min(up, down),  Math.min(left, right));
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns pattern = new Patterns();
        // pattern.pattern1(5); // Uncomment to see pattern1
        // pattern.pattern2(5); // Uncomment to see pattern2
        // pattern.pattern3(5); // Uncomment to see pattern3
        // pattern.pattern4(5); // Uncomment to see pattern4
        // pattern.pattern5(5); // Uncomment to see pattern4
        // pattern.pattern6(5); // Uncomment to see pattern6
        // pattern.pattern7(5); // Uncomment to see pattern7
        // pattern.pattern8(5); // Uncomment to see pattern8
        // pattern.pattern9(5); // Uncomment to see pattern9
        // pattern.pattern10(5); // Uncomment to see pattern10
        // pattern.pattern11(5); // Uncomment to see pattern10
        // pattern.pattern12(5); // Uncomment to see pattern10
        pattern.pattern17(5); // Uncomment to see pattern10

        // pattern.pattern14(5); // Uncomment to see pattern10
        // pattern.pattern22(4); // Uncomment to see pattern10
    }
}


