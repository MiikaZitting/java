package viikko02;
import java.util.Scanner;

public class Osoitetarra {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Anna etu-ja sukunimi: ");   
        String firstName = reader.next();
        String surName = reader.nextLine().trim();
        
        //Etunimi
        String firstLetter = firstName.substring(0,1).toUpperCase();
        String restLetters = firstName.substring(1).toLowerCase();
        firstName = firstLetter + restLetters;
        //Sukunimi
        firstLetter = surName.substring(0,1).toUpperCase();
        restLetters = surName.substring(1).toLowerCase();
        surName = firstLetter + restLetters;
        
        System.out.println("Anna katuosoite: ");
        //Osoite
        String address = reader.nextLine();
        firstLetter = address.substring(0,1).toUpperCase();
        restLetters = address.substring(1).toLowerCase();
        address = firstLetter + restLetters;
       
        System.out.println("Anna postinumero ja postitoimipaikka: ");
        //Postinumero & Toimipaikka
        String areacode = reader.next();
        String area = reader.nextLine().trim();
        area = area.toUpperCase();

    
        reader.close();

        System.out.println(firstName +" " + surName);
        System.out.println(address);
        System.out.println(areacode + " " + area);
        }
    }