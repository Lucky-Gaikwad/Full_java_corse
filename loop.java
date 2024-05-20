import java.util.Scanner;
public class loop{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
        int count = 500;
        while (count >= 200) {
         	System.out.println(count);
         	count -= 1;
        }
        int num = 0;
        while (num < 5) {
        	int number = input.nextInt();
        	System.out.println("Number is: " + number);
        num++;
        }
	}
}