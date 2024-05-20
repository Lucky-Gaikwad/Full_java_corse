import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker");
        System.out.print("Please enter the string to be checker: ");
        String str = input.next();
        System.out.println("Your string is: "
                + (isPalindrome(str) ? "palindrome"
                                     : "Not palindrome"));

    }

    public static boolean isPalindrome (String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
