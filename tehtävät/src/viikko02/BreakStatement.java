package viikko02;
import java.util.Scanner;

public class BreakStatement {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Toista teksti� "Ymm�rr�tk� TCP-vitsej�?" kunnes k�ytt�j�
		// vastaa "ACK"
		while (true) {
			System.out.println("This is a TCP/IP joke. I keep telling it until you get it. ");
			String answer = reader.nextLine();
			
			if(answer.equals("ack")) {
				break;
			}
		}
		 reader.close();
	}
}
