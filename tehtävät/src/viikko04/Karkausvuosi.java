package viikko04;

import java.util.Scanner;

public class Karkausvuosi {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Kirjoita vuosiluku: ");
		int year = reader.nextInt();
		reader.close();
		if (onkoKarkausvuosi(year)) {
			System.out.println("Vuosi " + year + " on karkausvuosi.");
		} else {
			System.out.println("Vuosi " + year + " ei ole karkausvuosi.");
		}

	}

	public static boolean onkoKarkausvuosi(int year) {		

		if (year % 400 == 0) return true;
		
		if (year % 100 == 0) return false;
		
		if (year % 4 == 0) return true;
		return false; }
}