package viikko04;

import java.util.Scanner;

public class KestoSekunteina {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Anna tunnit: ");
		int hours = reader.nextInt();
		System.out.println("Anna minuutit: ");
		int minutes = reader.nextInt();
		System.out.println("Anna sekunnit: ");
		int seconds = reader.nextInt();
		
		reader.close();
		
		int sum = KestoSekunteina.kestoSekunteina(hours, minutes, seconds);
		
		System.out.println("Yhteensä " + sum + " sekuntia.");
		}
		

	private static int kestoSekunteina(int hours, int minutes, int seconds) {
		// TODO Auto-generated method stub

		int hoursToSeconds = (hours * 60) * 60;
		int minutesToSeconds = minutes * 60;
		int sumAll = hoursToSeconds + minutesToSeconds + seconds;

		return sumAll;
	}
}
