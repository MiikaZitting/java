import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		System.out.print("Anna pizzojen hinnat (3): ");
		double pizza1 = reader.nextDouble();
		double pizza2 = reader.nextDouble();
		double pizza3 = reader.nextDouble();
		reader.close();
		if (pizza1 > pizza2) {
			if (pizza2 < pizza3) {
				double cheapest = pizza2;
				double sum = pizza1 + pizza2 + pizza3 - cheapest;
				double avg = sum / 3;
				System.out.println("Maksettavaa: " + twoDecimal.format(sum));
				System.out.println("Yksittäisen hinta: " + twoDecimal.format(avg));
		} else if (pizza1 > pizza3) {
			double cheapest = pizza3;
			double sum = pizza1 + pizza2 + pizza3 - cheapest;
			double avg = sum / 3;
			System.out.println("Maksettavaa: " + twoDecimal.format(sum));
			System.out.println("Yksittäisen hinta: " + twoDecimal.format(avg));
		}
		}else {
		double cheapest = pizza1;
		double sum = pizza1 + pizza2 + pizza3 - cheapest;
		double avg = sum / 3;
		System.out.println("Maksettavaa: " + twoDecimal.format(sum));
		System.out.println("Yksittäisen hinta: " + twoDecimal.format(avg));
			
		

}
}
}
