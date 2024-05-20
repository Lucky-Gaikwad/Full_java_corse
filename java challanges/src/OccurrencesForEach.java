import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");
        int[] arr = ArrayUtility1.inputArray();
        System.out.print("Please enter the number that you want to search: ");
        int element = input.nextInt();
        int occ = countOccurrences(arr, element);
        System.out.println("Your element was found: " + occ + " times.");
    }

    public static int countOccurrences (int[] arr, int element) {
        int occ = 0;
        for(int num: arr) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}
