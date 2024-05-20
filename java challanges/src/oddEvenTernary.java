import java.util.Scanner;

class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is odd Even station...");
        System.out.print("Please enter your number that you want to check: ");
        int num = input.nextInt();

        //ternary operator is using...
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is: " + result);
    }
}
