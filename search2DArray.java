import java.util.Scanner;
class search2DArray {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to searching station...\n");
		int[][] numArray = ArrayUtility.input2DArray();
		System.out.print("Please enter the number that you want to search: ");
		int num = input.nextInt();
		boolean isfound = search(numArray, num);
		if (isfound) {
			System.out.println("Your number was found.");
		} else {
			System.out.println("Your number was not found.");
		}

	}

	public static boolean search(int[][] numArray, int num){
		int i = 0;
		while (i < numArray.length) {
			int j = 0;
			while (j < numArray[i].length) {
				if (numArray[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
}