import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
