import java.util.Scanner;
class challange23 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("\nWelcome to New array station...\n");
		int[] numArr = ArrayUtility.inputArray();
		System.out.print("Please enter your number that want to delete: ");
		int numToDelete = input.nextInt();
		int[] newArray = deleteNumber(numArr, numToDelete);
		System.out.print("\nNow, your modify Array is : ");
		ArrayUtility.displayArray(newArray);
	}

	public static int[] deleteNumber(int[] numArr, int numToDelete) {
		int occ = challange20.noOfOccurrences(numArr, numToDelete);
		if (occ == 0) {
			return numArr;
		}
		int newSize = numArr.length - occ;
		int[] newArray = new int[newSize];

		int i = 0, j = 0;
		while (i < numArr.length) {
			if ( numArr[i] != numToDelete) {
				newArray [j] = numArr[i];
				j++;
			}
			i++;
		}
		return newArray;
	}
}