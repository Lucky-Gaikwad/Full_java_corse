import java.util.Scanner;
class palindrome { // it is a quite interesting program.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to palindrome station...");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		boolean ispalindrome = ispalindrome(num);
		if (ispalindrome) {
			System.out.println("Your number is a Palindrome Number.");
		} else {
			System.out.println("Your number is not a Palindrome Number.");
		}

	}

	public static boolean ispalindrome(int num){
	int numCopy = num;
	int sum = 0;
	while ( num > 0) {
		int digit = num % 10;
		  sum = sum * 10+ digit;
		num /= 10;
	}
	return sum == numCopy;
}
}

