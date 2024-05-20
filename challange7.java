import java.util.Scanner;
public class challange7{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int first = input.nextInt();
		System.out.print("Now, enter your second number: ");
		int second = input.nextInt();
		System.out.print("Now, enter your third number: ");
		int third = input.nextInt();

		if (first >= second && first >= third) {
			System.out.println("your greatest number is " + first);
		} else if (second >= third) {
			System.out.println("your greatest number is " + second);
		} else {
			System.out.println("your greatest number is " + third);
		}

	}
}