import java.util.Scanner;

class BodyMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your weight in kilogram: ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.printf("Your bmi %.2f - UNderweight",bmi);
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("Your bmi %.2f - Normal Weight",bmi);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.printf("Your bmi %.2f - Overweight",bmi);
        } else {
            System.out.printf("Your bmi %.2f - Obese",bmi);
        }
    }
}
