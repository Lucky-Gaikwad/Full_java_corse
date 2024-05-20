import java.util.Scanner;
class challange18 { /* this program is again very hard. I understood this program within 4-5 times. 
                       Then, it goes to The Mindhunter series. 
                       The name of this program is Armstrong number station*/
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nWelcome ot Armstrong number station...\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		boolean isArmStrongNumber = isArmStrongNumber(num);
		if ( isArmStrongNumber) {
			System.out.println("Your number is an Armstrong");
		} else {
			System.out.println("Your number is not an Armstrong");
		}
	}

	public static boolean isArmStrongNumber(int num) {
		int noOfDigits = noOfDigits(num);
		int numcopy = num;
		int finalNumber = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			finalNumber += pow(lastDigit, noOfDigits);
		}
		/* return false; this is an error because of the return statement is wrong.
		   The right return statement will be "return finalNumber == numcopy;"*/
		   return finalNumber == numcopy;
	}
	/*public static boolean isArmStrongNumber(int num) {
		int noOfDigits = noOfDigits(num);
		int finalNumber = 0; // There is no any copy of num over this loop that's why we introduce a copy of 
		                        //num over this loop 
		while ( num > 0) { 
			int lastDigit = num % 10;
			finalNumber += pow(lastDigit, noOfDigits);
		}
		return finalNumber == num;
	}*/

	public static int pow(int num1, int num2) {
		int result = 1;
		int i = 0;
		while (i < num2) {
			result *= num1;
			i++;
		}
		return result;
	}

	public static int noOfDigits(int num) {
		int digits = 0;
		while (num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
}