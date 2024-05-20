import java.util.Scanner;
class loopPatterns {
	public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to loop Patterns...");
        System.out.print("Please enter rows numbers: ");
        int num = input.nextInt();
        patterns(num);
        pattern2(num);


	}

	public static void patterns( int num ) {
		int rows = num;
		while (rows > 0) {
			int j = 0;
			while (j < rows - 1) {
				System.out.print("  ");
				j++;
			}
		
	
			int i = 0;
			while (i <= (num-rows)){
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
		}
		
		public static void pattern2( int num ) {
			int rows = 0;
			while ( rows < num ) {
				System.out.print("*");
				int i = 0;
				while (i < rows) {
					System.out.print(" *");
					i++;
				}
                 System.out.println();
				rows++;
			}
		}
}
	


