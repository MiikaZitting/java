package viikko02;
import java.util.Scanner;

public class Laskin {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Anna ensimmäinen luku: ");
		int first = reader.nextInt();
		System.out.println("Anna toinen luku: ");
		int second = reader.nextInt();
		System.out.println("Anna operaatio: ");
		String operation = reader.next();
		int result = 0;
		
		if (operation == "\"") {
			
			result = first / second;
			System.out.println(first +" "+ operation +" "+ second +" = " + result);
		}
			

		System.out.println(first +" "+ operation +" "+ second +" = ");
		reader.close();
	}
}
