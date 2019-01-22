package viikko02;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {
	public static void main(String[] args ) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double korvaus = 0.43;
		int sum = 0;
		int km = 1;
		while (km != 0) {
			System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
			km = reader.nextInt();
			sum = sum + km;
		}
		reader.close();
		System.out.println("Yhteensä " + sum + " kilometriä");
		System.out.println("Korvaus on " + twoDecimal.format(sum*korvaus) + " euroa");

	}
}
