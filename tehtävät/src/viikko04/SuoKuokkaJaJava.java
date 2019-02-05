package viikko04;

import java.util.Scanner;

public class SuoKuokkaJaJava {

	public static void main(String[] args) {
		// kysy käyttäjältä, montako kertaa teksti tulostetaan
		// kutsu tulostaTeksti-metodia toistorakenteen avulla useita kertoja

		Scanner reader = new Scanner(System.in);
		System.out.println("Kuinka monta kertaa tulostetaan? ");
		int kertaa = reader.nextInt();

		int loopVal;

		for (loopVal = 0; loopVal < kertaa; loopVal++)
			tulostaTeksti();

	}

	public static void tulostaTeksti() {

		System.out.println("Alussa olivat suo, kuokka ja Java.");
	}
}