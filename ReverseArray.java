class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Welcome to Array Reverse");
		int[] numArr = ArrayUtility.inputArray();
		reverse(numArr);
		System.out.println("Your reverse Array is: ");
		ArrayUtility.displayArray(numArr);
	}

	public static void reverse(int[] arr){
		int i = 0;
		while (i < arr.length/2) {
			int swap = arr[i];
			arr[i] = arr[(arr.length-1) - i];
			System.out.println(arr[i]);//arr(arr.length);
			i++;
		}
	}
} 