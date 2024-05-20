class challange22 {
	public static void main (String[] args) {
		System.out.println("Welcome to Array Sorting Check post\n");
		int[] numArr = ArrayUtility.inputArray();
		boolean isInc = isIncreasing(numArr);
		boolean isDec = isDecreasing(numArr);
		if (isInc || isDec) {
			System.out.println("Your Array is sorted");
		} else {
			System.out.println("Your Array is not sorted");
		}
	}

	public static boolean isIncreasing(int[] numArr) {
		int i = 1;
		while (i < numArr.length) {
			if (numArr[i] < numArr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static boolean isDecreasing(int[] numArr) {
		int f = 1;
		while (f < numArr.length) {
			if (numArr[f] > numArr[f-1]) {
				return false;
			}
			f++;
		}
		return true;
	}

}