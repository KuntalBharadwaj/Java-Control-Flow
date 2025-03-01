import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = num - 1;
        while (i > 0) {
            if (num % i == 0) {
                System.out.println("Greatest factor of " + num + " excluding itself: " + i);
                break;
            }
            i--;
        }
    }
}
