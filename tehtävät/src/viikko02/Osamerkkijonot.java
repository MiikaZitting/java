package viikko02;

public class Osamerkkijonot {
	  public static void main(String[] args) {
		  String book = "8 veljest�";
		  String end = book.substring(2);
		  
		  String newName = "7 " + end;
		  System.out.println(newName);
		  
		  String numbers = "yksikaksikolmenelj�";
		  System.out.println(numbers.substring(4, 9));

		  System.out.println(numbers.indexOf("kaksi"));
		  
		  System.out.println(numbers.indexOf("nelj�"));
	  }
}