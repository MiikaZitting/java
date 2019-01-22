package viikko01;
import java.util.Scanner;
public class Ylinopeus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Kerro nopeus:");
		int nopeus =  reader.nextInt();
		if (nopeus > 120)
		System.out.println("Ylinopeussakko!");
	}

}
