import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int power = sc.nextInt();

        int result = 1, counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + "^" + power + " = " + result);
    }
}
