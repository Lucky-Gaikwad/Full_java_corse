import java.util.Scanner;
public class challange6{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Odd Even Station\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();

	    if (num % 2 == 0) {
            System.out.println("your number is an even number.");

	    } else {
	    	System.out.println("your number is an odd number");
	    }
	    
	}
}
