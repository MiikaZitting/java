package viikko02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double amount = 1;

		System.out.println("Anna luotollisen ostoksen hinta: ");
		amount = reader.nextDouble();
		System.out.println("Anna kuukausierien lukum‰‰r‰: ");
		double months = reader.nextDouble();
		reader.close();
		
		
		
		

	}
}
