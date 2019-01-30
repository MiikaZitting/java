package tehtava11; // Poista t�m� rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Toteuta ohjelma, joka lukee k�ytt�j�lt� lukuja. Kun k�ytt�j� sy�tt�� luvun
 * 9999, lukujen lukeminen lopetetaan. Ohjelma tulostaa t�m�n j�lkeen pienimm�n
 * listalla olevan luvun sek� indeksit, joista pienin luku l�ytyy. Pienin luku
 * voi siis esiinty� useamman kerran.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Sy�t� kokonaislukuja listalle (9999 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == 9999) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhj� rivi tulosteeseen

        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti
        
        while (true) {
        	
        	
        }
    }
}
