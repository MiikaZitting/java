package viikko02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {
	public static void main(String[] args ) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double discount = 0.45;
		double sumAmount = 0;
		double amount = 1;
		
		while (amount != 0) {
			System.out.println("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
			amount = reader.nextDouble();
			sumAmount = sumAmount + amount;
		}
		reader.close();
		double discAmount =  ((sumAmount*discount)-100.0);
		if (discAmount > 2400) {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 2400,00 euroa");
		} else if (discAmount < 0 ) {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 0,00 euroa");
		} else {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on " + twoDecimal.format(discAmount) + " euroa");			
		
		}

	}
}
