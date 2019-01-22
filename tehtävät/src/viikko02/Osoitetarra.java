package viikko02;
import java.util.Scanner;

public class Osoitetarra {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna etu-ja sukunimi: ");   
        String firstName = reader.next();
        String lastName = reader.nextLine().trim();
        
        String firstNameLetter = firstName.substring(0,1).toUpperCase();
        String restFirstname = firstName.substring(1).toLowerCase();
        
        String firstSurLetter = lastName.substring(0,1).toUpperCase();
        String restSurName = lastName.substring(1).toLowerCase();
        
        System.out.println(firstNameLetter + restFirstname + " " + firstSurLetter + restSurName);
        
        System.out.println("Anna katuosoite: ");

        
        System.out.println("Anna postinumero ja postitoimipaikka: ");

        }
    }