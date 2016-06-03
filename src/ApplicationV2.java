import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationV2 {

	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////\n\nStarting Reverse Integer Program... \n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Integer: ");

		while (!(scanner.hasNext("exit"))) {

			try {
				int startNum = scanner.nextInt();
				int reverse = 0;
				int remainder;

				while (startNum != 0) {
					remainder = startNum % 10;
					reverse = reverse * 10 + remainder;
					startNum = startNum / 10;
				}

				System.out.println("\nReverse Integer: " + reverse);
				System.out.println("------------------------------" + "\n");
				System.out.println("Enter 'exit' to terminate program, or continue below.");
				System.out.print("Enter Integer: ");
			} catch (InputMismatchException e) {
				String bad_input = scanner.next();
				System.out.println("Bad Input: " + bad_input + "\n");
				System.out.print("Enter Integer: ");
				continue;
			}
		}
		System.out.println("\n//////////////////\nPROGRAM TERMINATED");
		System.out.println("//////////////////");
		scanner.close();
	}
}
