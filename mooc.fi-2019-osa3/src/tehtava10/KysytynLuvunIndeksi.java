package tehtava10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KysytynLuvunIndeksi {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == -1) {
				break;
			} else {
				luvut.add(syote);
			}
		}

		System.out.println();

		System.out.print("Mit� lukua etsit��n? ");
		int etsittava = lukija.nextInt();
		lukija.close();

		int number = 0;

		while (true) {
			if (number < luvut.size()) {
				int luku = luvut.indexOf(etsittava);
				
				System.out.println("Luku " + etsittava + " on indeksiss� " + luku);
				

			}
			break;
		}
	}

}