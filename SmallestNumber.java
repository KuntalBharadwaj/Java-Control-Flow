import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        System.out.println("Is the first number the smallest? " + (num1 < num2 && num1 < num3));
    }
}
