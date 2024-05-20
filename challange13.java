import java.util.Scanner;
class challange13 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Welcomr to LCM...");
		System.out.print("Please enter your number: ");
		int first = input.nextInt();
		System.out.print("Now, enter your second number: ");
		int second = input.nextInt();
		int lcm = lcm(first,second);
		System.out.println("LCM of the two numbers is: " + lcm);

			}
			public static int lcm(int first, int second){
				int i = 1;
				while (/*i <= second (this code ia valid but i have a better option to execute this condition) */ true) {
					int factor = first * i;
					if (factor % second == 0) {
						return factor;
					}
					i++;
				}
//return 0; // unreachable because of the end of this loop is at 19.
			}
			
}