import java.util.Scanner;

class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum number finder ststion...");
        System.out.print("Please enter your number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int num2 = input.nextInt();

        int minimumNumber = num1 > num2 ? num2 : num1;
        System.out.println(minimumNumber + " is your minimum number.");

    }
}
