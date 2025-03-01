import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextDouble();
            total += num;
        } while (num != 0);
        System.out.println("Total sum: " + total);
    }
}
