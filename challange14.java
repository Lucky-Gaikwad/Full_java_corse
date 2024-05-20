import java.util.Scanner;
class challange14 { // it is a good challange for learning the double method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Welcome to HCF station...");
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int hcf = hcf(first, second);
        System.out.print("hcf of the numbers is: " + hcf);
	}
	public static int hcf(int num1, int num2) {
		
		int hcf = 1;
		int i = 2;
		int num = least(num1, num2);
		while (i <= num) {
			if (num1 % i == 0 && num2 % i == 0){
				hcf = i;
			}
			i++;
		}

		return hcf;

	}
	public static int least(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}

	}

}