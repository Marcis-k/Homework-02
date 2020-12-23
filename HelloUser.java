
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Ievadiet Vārdu Uzvārdu:");
		String xx = input.nextLine();

		input.close();
		String[] xToString = xx.trim().split("\\s+");

		for (int i = 0; i < xToString.length; i++) {
			if (i == 0) {
				System.out.println("'" + xToString[0].substring(0, 1).toUpperCase() + xToString[0].substring(1) + "'");
			} else if (i == 1) {
				System.out.println("'" + xToString[1].toUpperCase() + "'");
			} else if (i == 2) {
				System.out.println("'" + xToString[2].toUpperCase() + "'");
			}
		}

	}
}
