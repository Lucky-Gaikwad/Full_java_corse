import java.util.Scanner;

class absoluteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Number station...");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();


        // ternary Operator
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute valure of your given number " + result);
    }
}
