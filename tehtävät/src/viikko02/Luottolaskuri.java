package viikko02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");	
		System.out.println("Anna luotollisen ostoksen hinta: ");
		double amount = reader.nextDouble();
		System.out.println("Anna kuukausierien lukumäärä: ");
		int months = reader.nextInt();
		int i = 1;
		double paymentAmount = amount / months;
		
		while (amount > 0) {
			amount = amount - paymentAmount;
			
			System.out.println(i + ". erä " + twoDecimal.format(paymentAmount) + " euroa, luottoa jäljellä " + twoDecimal.format(amount) + " euroa");
			i++;
		}
		
		
		
		

		reader.close();
	}
}
