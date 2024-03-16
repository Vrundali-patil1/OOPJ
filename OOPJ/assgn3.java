import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator(+,-,*,/): ");
        char operator = sc.next().charAt(0);

        switch(operator) {
        case'+':
        System.out.println(num1+ " + " + num2 + " is = " +(num1+num2));
        break;

        case '-':
        System.out.println(num1+ " - " + num2 + " is = " +(num1-num2));
        break;
        
        case '*':
        System.out.println(num1+ " * " + num2 + " is = " +(num1*num2));
        break;

        case '/':
        if(num2 != 0) {
            System.out.println(num1+ " / " + num2 + " is = " +(num1/num2));
        } else { 
            System.out.println("Cannot divide by Zero");
        }
        break;

        default:
        System.out.println("Invalid input");


    }
    }
}
