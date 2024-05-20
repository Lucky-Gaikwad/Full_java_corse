import java.util.Scanner;
public class challange5{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Determiner Station\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();

		if (num > 0) {
			System.out.println("your number is Positive.");
		} else if (num == 0) {
			System.out.println("your number is Zero.");
		} else {
			System.out.println("your number is Negative.");
		}
	}
}