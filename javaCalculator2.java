// import java.util.Scanner;
// public class javaCalculator2{
// 	public static void main(String[] args){
// 		greet();

// 		// int first = readNumber();
// 		// int second = readNumber();

//         int first = readNumber() + 1;
//         int second = readNumber() + 2;
         
// 		int sum = first + second;
// 		System.out.print("Result is: "+ sum);
// 	}

// 	public static int readNumber() {
// 		Scanner input = new Scanner (System.in);
// 		System.out.print("Please enter your number: ");
// 		int number = input.nextInt();
// 		return number;
// 	}

// 	public static void greet() {
// 		System.out.println("\nWelcome to Calculator\n");
// 	}

// }
public class javaCalculator2 { // it's a differentiating lecture between parameter and argument
	public static void main(String[] args) {
		
		System.out.println(sumTwoNumber(4 , 7));
     System.out.println(sumTwoNumber(5 , 8));
	}

	public static int sumTwoNumber(int first, int second) {
		System.out.println("first Number recieved: " + first);
		System.out.println("second Number recieved: " + second);
		// int sum = first + second;
		// return sum;
		return first + second;
	}
}

















