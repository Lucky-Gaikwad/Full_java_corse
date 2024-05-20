import java.util.Scanner;

class studentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Score..");
        System.out.print("Please enter your score: ");
        int marks = input.nextInt();

        // ternary operator in another ternary operator
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is: " + category);
    }
}
