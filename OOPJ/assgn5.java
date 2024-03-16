import java.util.Scanner;

class CharacterV {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input a chracter (a-z): ");
    char ch = sc.next().charAt(0);
     
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println(ch+ " is a vowel ");
    } else if(ch >= 'a' && ch <= 'z') {
        System.out.println(ch+ " is a consonant ");
    } else {
        System.out.println("Invalid Input");
    }

}
}
