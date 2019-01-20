import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {
	
	private static Scanner reader;
	
	public static void main(String[] args) {
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		reader = new Scanner(System.in);
		System.out.println("Anna ajetut kilometrit: ");
		double matka = reader.nextDouble();
		System.out.println("Anna kulutus per 100 km: ");
		double kulutus = reader.nextDouble();
		System.out.println("Anna polttoaineen litrahinta: ");
		double hinta = reader.nextDouble();
		System.out.println("Anna kimppakyytil�isten lukum��r�: ");
		int m��r� = reader.nextInt();
		String kustannus = twoDecimal.format(matka * kulutus / 100.0 * hinta / m��r�);
		System.out.println("Bensakustannus per henkil� on " + kustannus + " euroa");
	}
}