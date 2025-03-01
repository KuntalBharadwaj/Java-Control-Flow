import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println("The person's age is " + age + " and " + (age >= 18 ? "can vote." : "cannot vote."));
    }
}
