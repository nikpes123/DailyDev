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
            System.out.println("");
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
        for (int i = n ; i > 0 ;i--){
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
    public static void main(String[] args) {
        Patterns pattern = new Patterns();
        // pattern.pattern2(5);
        // pattern.pattern3(5);
        // pattern.pattern5(5);
    }
    
}


