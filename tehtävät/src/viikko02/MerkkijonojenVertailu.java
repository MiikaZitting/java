package viikko02;

import java.util.Scanner;

public class MerkkijonojenVertailu {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Sy�t� kaksi merkkijonoa.");
		String eka = reader.nextLine();
		String toka = reader.nextLine().trim();

		if (eka.equals(toka)) {
			System.out.println("Sy�tetyt merkkijonot olivat samat!");
		} else {
			System.out.println("Sy�tetyt merkkijonot eiv�t olleet samat!");
		}
		reader.close();
	}
}