import java.util.Scanner;
public class javaCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int first = input.nextInt();
		System.out.print("Now, enter your second number: ");
		int second = input.nextInt();

		int sum = first + second;
		System.out.print("Result is: "+ sum);
	}

}