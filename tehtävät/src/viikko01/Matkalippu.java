package viikko01;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Matkalippu {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.print("Montako matkaa teet kuukaudessa: ");
		int trips = reader.nextInt();
		System.out.print("Anna yksittäisen lipun hinta: ");
		double singlePrice = reader.nextDouble();
		System.out.print("Anna kuukausilipun hinta: ");
		double monthPrice = reader.nextDouble();
		reader.close();
		double singleSum = (trips * singlePrice);
		String diffSingle = twoDecimal.format(monthPrice - singleSum);
		String diffMonth = twoDecimal.format(singleSum - monthPrice);
		
		if (singleSum < monthPrice) {
		System.out.println("Yksittäinen on " + diffSingle + " euroa halvempi kuin kuukausilippu");
		
	} else
		System.out.println("Kuukausilippu on " + diffMonth + " euroa halvempi kuin yksittäinen");
}
}