class array {
	public static void main(String[] args) {
		
		// int[] myArr = new int[5];
		// myArr[0] = 45;
		// myArr[1] = 23;
		// myArr[2] = 41;
		// myArr[3] = 20;
		// myArr[4] = 4;
		int [] myArr = {45, 23, 41, 20, 4};
		// System.out.println(myArr[0]);
		// System.out.println(myArr[1]);
		// System.out.println(myArr[2]);
		// System.out.println(myArr[3]);
		// System.out.println(myArr[4]);
		// Array traversal
		int index = 0;
		while (index < myArr.length) {
			System.out.println(myArr[index]);
			index++;
		}
		String[] strArr = new String[4];
		strArr[0] = "My String";

		String[] newStrArr = {"first", "second", "third"};
		System.out.println(newStrArr.length);
		int i = 0;
		while (i < newStrArr.length) {
			System.out.print(newStrArr[i] + " ");
			i++;
		}

	}
}