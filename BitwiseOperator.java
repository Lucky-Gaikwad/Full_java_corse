import java.util.Scanner;
public class BitwiseOperator{
	public static void main(String [] args){
        // this is Bitwise Operator Lecture
		Scanner input = new Scanner(System.in);
		System.out.println("Showcasing Bitwise And Operator\n");
		System.out.print("Please enter your first number: ");
		int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: " + result);

        int result2 = first | second;
        System.out.println("Result is: " + result2);

        int result3 = first ^ second;
        System.out.println("Result is: " + result3);

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result5 = num >> 1;
        System.out.println("Result5 is: " + result5);

        int result6 = num >> 2;
        System.out.println("Result6 is: " + result6);

        int result7 = num << 1;
        System.out.println("Result7 is: " + result7);

        int result4 = ~num;
        System.out.println("Result4 is: " + result4);

       

	}
}