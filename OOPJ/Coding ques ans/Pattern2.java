/* 
*********
 *     *
  *   *
   * *
    *
*/
public class Pattern2 {
    public static void main(String[] args) {
        int size = 5; // Number of rows in the triangle

        // Outer loop for rows
        for (int i = size; i >= 1; i--) {
            // Inner loop for spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                // Print stars only for the first and last rows, and for the first and last columns
                if (i == size || k == 1 || k == 2 * i - 1) {
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


