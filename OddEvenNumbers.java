import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) 
                System.out.println(i + " is Even");
            else 
                System.out.println(i + " is Odd");
        }
    }
}
