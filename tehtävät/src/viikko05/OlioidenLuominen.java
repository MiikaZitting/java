package viikko05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class OlioidenLuominen {

		public static void main(String[] args) {
			new ArrayList<Integer>();
			new Scanner(System.in);
			
			// Uusi olio luodaan new-avainsanalla
			
		
			
			ArrayList<Integer> lista = new ArrayList<>();
			DecimalFormat twoDecimal = new DecimalFormat("0.00");
			DecimalFormat threeDecimal = new DecimalFormat("0.000");
			
			// olioilla on metodeja, joita voidaan kutsua:
		
			double NOT_PI = 3.141592653589793;
			System.out.println(twoDecimal.format(NOT_PI));
			System.out.println(threeDecimal.format(NOT_PI));
			System.out.println(Math.PI);
		}
}
