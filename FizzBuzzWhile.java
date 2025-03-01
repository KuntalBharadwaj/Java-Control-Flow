import java.util.Scanner;

public class FizzBuzzWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		int n = 0;
		
		while(n <= number) {
			if(n % 3 == 0 && n % 5 == 0) System.out.println("FizzBuzz");
			else if(n % 3 == 0) System.out.println("Fizz");
			else if(n % 5 == 0) System.out.println("Buzz");
			else System.out.println(n);
			n++;
		}
	}
}