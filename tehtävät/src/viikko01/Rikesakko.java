package viikko01;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Rikesakko {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.println("Anna nopeusrajoitus: ");
		int limit = reader.nextInt();
		System.out.println("Anna nopeutesi: ");
		int speed = reader.nextInt();
		reader.close();

		if (speed < limit) {
			System.out.println("Ajoit rajoituksen mukaan.");
		} else if (speed > limit + 20) {
			System.out.println("Menee päiväsakoille");
		} else if (limit >= 10 && limit <= 60) {
			if (speed > limit + 15) {
				System.out.println("Rikesakko on 200");
			} else {
				System.out.println("Rikesakko on 170");
			}
		} else if (limit >= 70 && limit <= 120) {
			if (speed > limit + 15) {
				System.out.println("Rikesakko on 200");
			} else {
				System.out.println("Rikesakko on 140");
			}

		}
	}
}