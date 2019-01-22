package viikko02;

public class Lahtolaskenta {
	public static void main(String[] args ) {
		// Toista luvut sadasta yhteen
		for (int i = 100; i >= 1 ; i-- ) {
			// Suorita vain jos i ei jaollinen kolmella:
			if (i % 3 != 0) {
				System.out.println(i);
				
			}
		}
	}
}
