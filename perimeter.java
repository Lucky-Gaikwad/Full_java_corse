import java.util.Scanner;
public class perimeter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to my perimeter calculator");
		System.out.print("Please enter all 4 side in cms: "); 
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = input.nextDouble();

			double per = a + b + c + d;

			System.out.println("Perimeter of your rectangle is: " + per + "cm");
		
	}
}