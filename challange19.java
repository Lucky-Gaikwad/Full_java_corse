import java.util.Scanner;
class challange19 {
	public static void main(String [] args) {
		
		System.out.println("Welcome to Sum and Average station of Array...");
		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		int avg = average(numArray);
		System.out.println("Sum of the numbers is:" + sum);
		System.out.println("Average of the numbers is: " + avg);
	}
	public static long sum( int[] numArray ) {
		long sum = 0;
		int i = 0;
		while (i < numArray.length) {
			sum += numArray[i];
			i++;
		}
		return sum;
	}

	public static int average( int[] numArray ) {
		long sum = sum(numArray);

		return (int) (sum / numArray.length);
	}
} 