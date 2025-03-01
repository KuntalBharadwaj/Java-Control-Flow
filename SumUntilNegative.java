import java.util.Scanner;
public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();
            if (num <= 0) break;
            sum += num;
        }

        System.out.println("Total sum: " + sum);
    }
}
