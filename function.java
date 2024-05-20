public class function{
	public static void main(String[] args){
		// System.out.println("In main method");
		// greeting();
		// System.out.println("Method calling complete");
printFirstProgram();
// printSecondProgram();
// printThirdProgram();
	}
	public static void printFirstProgram() {
		// System.out.println("*");
		// System.out.println("* *");
		// System.out.println("* * *");
		// System.out.println("* * * *");
		// System.out.println("* * * * *");
		int rows = 0;
		while (rows < 4) {
			System.out.print("*");
			int i = 0;
			while (i < rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++;
		}
    }
	public static void printSecondProgram() {
		System.out.println("* * * * *");
		System.out.println("* * * *");
		System.out.println("* * *");
		System.out.println("* *");
		System.out.println("*");
    }
	public static void printThirdProgram() {
		System.out.println("        *");
		System.out.println("      * *");
		System.out.println("    * * *");
		System.out.println("  * * * *");
		System.out.println("* * * * *");
	}

    /* public static void greeting() {
     	System.out.println("Welcome to our page...");
     }*/

}