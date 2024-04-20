/*
             1   
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1

*/
public class Pattern4 {
    public static void main(String[] args) {
        int size = 5; // Number of rows in the triangle

        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Print spaces before numbers in each row
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }

            int number = 1;
            // Inner loop for numbers in each row
            for (int j = 0; j <= i; j++) {
                System.out.print(String.format("%4d", number)); // Adjust spacing for alignment
                number = number * (i - j) / (j + 1);
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

