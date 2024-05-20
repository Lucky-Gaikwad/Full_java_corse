import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to my calculator");
	System.out.print("Please enter first number: ");
	int firstNum = input.nextInt();
	System.out.print("Now, please enter your second number: ");
	int secondNum = input.nextInt();
	int sum = firstNum + secondNum;
	System.out.println("sum of your numbers is: " + sum);

	}
}