import java.util.Scanner;
public class challange8{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to odd even station");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();

        if ((num & 1) ==1) {
        	System.out.println("Your Digit is: " + num + " (an odd number)");
        } else {
        	System.out.println("Your Digit is: " + num + " (an even number)");
        }

	}
}