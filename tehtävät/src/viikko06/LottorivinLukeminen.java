package viikko06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottorivinLukeminen {

	public static void main(String[] args) {
		// TODO Toteuta split metodia k�ytt�en
		Scanner reader = new Scanner(System.in);

		List<Integer> lottonumbers = new ArrayList<>();

		System.out.println("Anna oikea rivi (7 numeroa ja lis�numero): ");

		for (int i=0; i<8; i++) {
			int number = reader.nextInt();
			lottonumbers.add(number);
			
		}

		System.out.println(lottonumbers);

	}

}
