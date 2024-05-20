import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guessing number game");
        int num = 5, guess;

        do {
            System.out.print("Please enter the number between 1 to 10: ");
            guess = input.nextInt();
        } while (guess != num);
        System.out.println("You have successfully guessed the number.");
    }
}
