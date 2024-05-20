import java.util.Scanner;
public class MindhunterChallange1{
	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to leap year calculator...");
		System.out.println("Please enter the year that you want to check: ");
		long year = input.nextLong();

		if (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Your year is a leap year");
		} 
		  else {
			System.out.println("your year is not a leap year");
		}
	}
}