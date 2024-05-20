import java.util.Scanner;
class arraySearching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = {2, 3, 23, 45, 20, 43, 50, 40, 30, 25};
		System.out.println("Welcome to Array searching...\n");
		System.out.print("Please enter your number: ");
		int num = input.nextInt();
		boolean isFound = isFound(array, num);
		if (isFound) {
			System.out.println("Your number was found in the array");
		} else {
			System.out.println("Your number was not found in the array");		
		}
	}
	public static boolean isFound(int[] array, int num) {
		int index = 0;
		while (index < array.length) {
			if (array[index] == num){
				return true;
			}
			index++;
		}
		return false;

	}
}