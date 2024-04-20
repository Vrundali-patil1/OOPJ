 /*
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
public class Pattern3 {
    public static void main(String[] args) {
    int size = 5;
    int num = 1;

    for (int i = 1;i<=size;i++) {
        for (int j = 1;j<=i;j++) {
        
            System.out.print(num+ " ");
            num++;
        }
        System.out.println( );
    }
    
}
}
