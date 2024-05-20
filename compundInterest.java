import java.util.Scanner;
public class compundInterest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.println("Welcome to compund interest calculator");
System.out.print("Please enter your principle amount Rs");
int principle = input.nextInt();
System.out.print("Now, enter your rate of interest: ");
float rate = input.nextFloat();
System.out.print("Now, tell me for how many years are you boring this money: ");
float year = input.nextFloat();
double comint = principle * Math.pow((1+ rate/100), year);
System.out.println("\n\n Your compund Interest is in Rs:" + comint);
	}


}