package viikko06;

import java.util.Arrays;
import java.util.Scanner;

public class SanojenVaihtaminen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Kirjoita lause: ");

		String line = reader.nextLine();
		String[] taulukko = line.split(" ");

		String taulukkoString = Arrays.toString(taulukko);

		System.out.println("Mitk‰ sanat vaihdetaan kesken‰‰n? ");
		int first = reader.nextInt();
		int second = reader.nextInt();

		reader.close();

		System.out.println(SanojenVaihtaminen(line, first, second));

	}

	public static String SanojenVaihtaminen(String line, int first, int second) {

		String[] separate = line.split(" ");
		String word = separate[first];
		separate[first] = separate[second];
		separate[second] = word;
		return String.join(" ", separate);

	}

}
