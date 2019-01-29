package viikko02;

import java.util.Scanner;

public class MerkkijonojenVertailu {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Syötä kaksi merkkijonoa.");
		String eka = reader.nextLine();
		String toka = reader.nextLine().trim();

		if (eka.equals(toka)) {
			System.out.println("Syötetyt merkkijonot olivat samat!");
		} else {
			System.out.println("Syötetyt merkkijonot eivät olleet samat!");
		}
		reader.close();
	}
}