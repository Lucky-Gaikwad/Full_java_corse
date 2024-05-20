import java.util.Scanner;
class challange17 {
	public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to fibonacci series...");
     System.out.print("Please enter your number: ");
     int num = input.nextInt();
    System.out.println("Here is the fibonacci series");
    printFibonacci(num);

	}
	public static void printFibonacci(int num) {
		if (num < 0) return;
		System.out.print("0 ");
		if (num == 0) return;
		System.out.print("1 ");
		
		int first = 0, second = 1;
		while (first + second <= num) {
			int third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}

	}
}