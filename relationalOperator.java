import java.util.Scanner;
public class relationalOperator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Driving License Portal");
		System.out.print("Please enter your age: ");
		int age = input.nextInt();

	    if (age >= 18) {
	    	System.out.println("you are eligible to Driving");
	    } else {
	    	System.out.println("Beta cycle chalo");
	    }
	}
} 