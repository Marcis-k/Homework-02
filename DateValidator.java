
import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ievadiet Datumu un mēnesi!");
		System.out.print("Ievadiet datumu:");
		int y = input.nextInt();
		System.out.print("Ievadiet mēnesi pēc kārtas:");
		int x = input.nextInt();
		System.out.print("Ievadiet gadu:");
		int z = input.nextInt();

		input.close();

		String[] month = new String[] { " ", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		// Formula lai uzzinātu vai īsais vai garais gads
		boolean longYear = ((z % 4 == 0) && (z % 100 != 0) || (z % 400 == 0));

		if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
			if (y <= 31) {

				System.out.print(y + ". ");
				System.out.print(month[x]);
				System.out.print(" " + z);
			} else {
				System.out.println("Kāds no ievadītavien datiem nav patiess!11");
			}

		}

		if (x == 4 || x == 6 || x == 9 || x == 11) {
			if (y <= 30) {

				System.out.print(y + " ");
				System.out.print(month[x]);
				System.out.print(" " + z);
			} else {
				System.out.println("Kāds no ievadītavien datiem nav patiess!22");
			}
		}

		if (x == 2) {
			if (longYear && y <= 29) {
				System.out.print(y + " ");
				System.out.print(month[x]);
				System.out.print(" " + z);
			} else if (!longYear && y <= 28) {
				System.out.print(y + " ");
				System.out.print(month[x]);
				System.out.print(" " + z);
			} else {
				System.out.println("Kāds no ievadītavien datiem nav patiess!33");
			}
		}

	}

}
