import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Mit� kello on? Anna tunnit: ");
		int clock = reader.nextInt();
		

		if (clock >= 22 || clock < 7)
			System.out.println("Hyv�� y�t�!");
		else if (clock < 10)
			System.out.println("Hyv�� huomenta!");
		else if (clock < 17)
			System.out.println("Hyv�� p�iv��!");
		else if (clock < 22)
			System.out.println("Hyv�� iltaa!");
	}
}