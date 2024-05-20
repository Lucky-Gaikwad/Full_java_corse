import java.util.Scanner;
public class GradesCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to GradesCalculator...\n");
		System.out.println("Please enter your persentage value: ");
        float value = input.nextFloat();

        if (value >= 90) {
        	System.out.println("Your grade is: A");
        } else if (value > 75 ) {
        	System.out.println("Your grade is: B");
        } else if (value >60 ) {
        	System.out.println("Your grade is: C");
        }else if (value >30 ) {
        	System.out.println("Your grade is: D");
        } else{
        	System.out.println("your grade is: F");
        }
	}
}