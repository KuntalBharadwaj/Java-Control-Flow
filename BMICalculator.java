import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble();
        
        height /= 100;
        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);
    }
}
