import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) {
		System.out.println("Starting Reverse Integer Program... \n");

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Integer: ");

		while (!(scanner.hasNext("exit"))) {

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
			System.out.println("Enter 'exit' to terminate program, or continue below.\n");
			System.out.print("Enter Integer: ");
		}
		System.out.println("\nProgram Terminated");
		System.out.println("//////////////////");
	}
}
