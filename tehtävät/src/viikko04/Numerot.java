package viikko04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numerot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		List<Integer> arvot = new ArrayList<Integer>();
		
		arvot.add(1);
		arvot.add(12);
		arvot.add(8);
		arvot.add(5);
		arvot.add(6);
		
		System.out.println("Muodostetaan lista: " + arvot);
		
		System.out.println("Listan pienin arvo on: " + pienin(arvot));
		
		System.out.println("Listan suurin arvo on: " + suurin(arvot));

		System.out.println("Listan arvojen summa on: " + summa(arvot));
	}


	public static int pienin(List<Integer> arvot) {

		int pienin = arvot.get(0);

		int indeksi = 0;
		while (indeksi < arvot.size()) {
			int luku = arvot.get(indeksi);
			if (pienin > luku) {
				pienin = luku;
			}

			indeksi = indeksi + 1;
		}

		return pienin;

	}

	public static int suurin(List<Integer> arvot) {

		int suurin = arvot.get(0);

		int indeksi = 0;
		while (indeksi < arvot.size()) {
			int luku = arvot.get(indeksi);
			if (suurin < luku) {
				suurin = luku;
			}

			indeksi = indeksi + 1;
		}

		return suurin;

	}

	public static int summa(List<Integer> arvot) {

		int number = 0;
		int sum = 0;
		while (number < arvot.size()) {
			sum = sum + arvot.get(number);
			number++;

		}
		return sum;
	}
}