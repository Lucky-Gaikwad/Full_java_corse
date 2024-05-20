import java.util.Scanner;
public class challange4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my Arithmatic calculator\n");
		System.out.print("Please enter your first number: ");
		int first = input.nextInt();
		System.out.print("Now, Please enter your second number: ");
		int second = input.nextInt();

		int add = first + second;
		int sub = first - second;
		int mul = first * second;
		int div = first / second;
		int mod = first % second;

System.out.println("Your Addition is: " + add);
System.out.println("Your Subtraction is: " + sub);
System.out.println("Your Multiplicaton is: " + mul);
System.out.println("Your Division is: " + div);
System.out.println("Your Modulus is: " + mod);
System.out.println("Now, we will be showing you the calculator of floating point numbers...");
System.out.print("Please enter your first decimal number: ");
double first1 = input.nextDouble();
System.out.print("Now, Please enter your second decimal number: ");
double second1 = input.nextDouble();

System.out.print("\n Result is: " + (first1 * second1));
System.out.print("\n second Result is:" + (first1 + second1));


	}
}