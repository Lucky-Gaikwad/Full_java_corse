import java.util.Scanner;
class challange9{ // multiplication table tool
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to MultiplicationWorld\n");
System.out.print("Please enter your number: ");
int num = scanner.nextInt();
printMultiplicationTable(num);
	}

	public static void printMultiplicationTable(int num) {
		int i = 1;
		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + (num * i));
			i++;
		}

	}

	
}