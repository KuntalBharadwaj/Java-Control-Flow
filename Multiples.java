import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int num = sc.nextInt();

        System.out.println("Multiples of " + num + " below 100:");
        for (int i = 1; i < 100; i++) {
            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
