class palindromeInArray {
	public static void main (String[] args) {
		System.out.println("Welcome to Palindrome station...\n");
		int[] numArr = ArrayUtility.inputArray();
		boolean isPalin = isPalindrome(numArr);
		if (isPalin) {
			System.out.println("Your array is a palindrome");
		} else {
			System.out.println("Your array is not a palindrome");
		}
	}

	public static boolean isPalindrome(int[] numArr) {
		int i = 0;
		while (i < numArr.length / 2) {
			if (numArr[i] != numArr[(numArr.length - 1) - i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}