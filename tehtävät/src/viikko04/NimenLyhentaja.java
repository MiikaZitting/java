package viikko04;

import java.util.Scanner;

public class NimenLyhentaja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Syötä etu- ja sukunimi: ");

        String etu = input.next();
        String suku = input.next();

        input.close();
        
        String lyhennetty = Lyhentaja.lyhennaNimi(etu, suku);
        System.out.println("Lyhennettynä: " + lyhennetty);
       
    }
}