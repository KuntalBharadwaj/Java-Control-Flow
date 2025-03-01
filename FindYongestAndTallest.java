import java.util.Scanner;

public class FindYongestAndTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ages of the friends : ");
		
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();

		System.out.print("Enter heights of the friends : ");
		
		int height1 = sc.nextInt();
		int height2 = sc.nextInt();
		int height3 = sc.nextInt();
		
		if(age1 < age2 && age1 < age3) System.out.println("The youngest friends among them is : " + age1);
		else if(age2 < age1 && age2 < age3) System.out.println("The youngest friends among them is : " + age2);
		if(age3 < age1 && age3 < age2) System.out.println("The youngest friends among them is : " + age3);
		
		if(height1 > height2 && height1 > height3) System.out.println("The Tallest friends among them is : " + height1);
		else if(height2 > height1 && height2 > height3) System.out.println("The Tallest friends among them is : " + height2);
		if(height3 > height1 && height3 > height1) System.out.println("The Tallest friends among them is : " + height3);
		
	}
}