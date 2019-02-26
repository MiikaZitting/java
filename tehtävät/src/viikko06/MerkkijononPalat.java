package viikko06;

import java.util.Arrays;
import java.util.Scanner;


public class MerkkijononPalat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Kirjoita lause: ");

		String line = reader.nextLine();
		String[] taulukko = line.split(" ");

		String taulukkoString = Arrays.toString(taulukko);

		int index = 0;
		
		while (index < taulukko.length){
			String word = taulukko[index];
			System.out.println(word);
			index++;
			
		}

	}

}
