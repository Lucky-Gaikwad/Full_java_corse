import java.util.Scanner;
public class logicalOperator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ticket Discount Calculator");
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		System.out.print("Are you a female? (true/false)");
		boolean isFemale = input.nextBoolean();

		if (age < 5) {
			System.out.println("You got 75% Discount");
		} else if (isFemale) {
			System.out.println("you got 50% Discount");
		} else if (age > 60 && !isFemale){
			System.out.println("you got 25% Discount");
		} else {
			System.out.println("you got no Discount");
		}
	}
}