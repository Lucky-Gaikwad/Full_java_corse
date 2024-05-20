import java.util.Scanner;
public class simpleInterest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.println("Welcome to simple interest calculator");
System.out.print("Please enter your principle amount Rs");
int principle = input.nextInt();
System.out.print("Now, enter your rate of interest: ");
float rate = input.nextFloat();
System.out.print("Now, tell me for how many years are you boring this money: ");
float year = input.nextFloat();
float interest = (principle * rate * year)/100;
System.out.println("\n\n Your Simple Interest is in Rs:" + interest);
	}

}