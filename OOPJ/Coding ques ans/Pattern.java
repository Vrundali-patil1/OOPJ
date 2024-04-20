/*  
1)
* 
* *
*   *
*     *
*********
*/
public class Pattern {
    public static void main(String[] args) {
        int size = 5; // Size of the pattern (number of rows)

        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                // Print asterisks based on conditions
                if (j == i || j == 0 || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

