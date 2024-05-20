public class twoDimentionalArray {
	public static void main(String[] args) {
		// int[][] arr = {{}, {}};
		// System.out.println(arr.length);
		int[][] muArr = new int[2][3];
		muArr[0][0] = 9;
		int[][] arr = {{3,4,5}, {1,5,4}, {7,8,9}};
		// System.out.println(arr[0].length);
        // Traversal
		int i = 0;
		while (i < arr.length) {
		   int	j = 0;
		   while (j < arr[i].length) {
		   	System.out.print(arr[i][j] + " ");
		   	j++;
		   }
		   System.out.println();
		   i++;

		}
	}
}