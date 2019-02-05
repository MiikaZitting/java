package viikko04;

public class Laskuoperaatiot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first = 9.0;
		double second = 3.0;

		System.out.println("Suoritetaan testi arvoilla " + first + " ja " + second + ":\n");

		double plus = Laskuoperaatiot.summa(first, second);
		System.out.println(first + " + " + second + " = " + plus);

		double minus = Laskuoperaatiot.erotus(first, second);
		System.out.println(first + " - " + second + " = " + minus);
	}

	public static double summa(double first, double second) {
		// TODO Auto-generated method stub

		double result = first + second;
		return result;
	}

	public static double erotus(double first, double second) {

		double result2 = first - second;
		return result2;

	}
}
