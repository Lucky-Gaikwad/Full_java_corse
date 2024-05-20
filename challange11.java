import java.util.Scanner;
class challange11 { // factorial
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to factorialProduct ");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		int multi = factorialProduct(num);
		System.out.println("factorialProduct is: " + multi);
	}

	public static int factorialProduct( int num ) {
		int multi = 1;
		int i = 1;
		while (i <= num) {
             multi *= i;
             i += 1;
             
		}

        return multi;

	}

}