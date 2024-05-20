import java.util.Scanner;
class challange15 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to prime station...");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.println("Your number is a prime number.");
		} else {
			System.out.println("Your number is not a prime number.");
		}

			}
			public static boolean isPrime(int first) {
				int i = 2;
				while ( i < first) {
					if (first % i == 0) {
						return false;
				}
				i++;
					}
					return true;

				
			}
}