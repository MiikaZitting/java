package tehtava08; // Poista t�m� rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee k�ytt�j�lt� lukuja
 * listalle. Sy�tteiden lukeminen p��tet��n kun k�ytt�j� sy�tt�� luvun -1.
 * 
 * Lis�� ohjelmaan toiminnallisuus, joka lukujen lukemisen j�lkeen kysyy
 * k�ytt�j�lt� alkuindeksi� ja loppuindeksi�. T�m�n j�lkeen ohjelman tulostaa
 * listalla olevat luvut k�ytt�j�n sy�tt�mien indeksien v�lill�. Voit olettaa,
 * ett� k�ytt�j� sy�tt�� indeksit, jotka l�ytyv�t listalta.
 * 
 * T�m�n teht�v�n on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhm�. Teht�v� on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssill� ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Sy�t� kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }

        System.out.println(); // Tyhj� rivi tulosteeseen

        System.out.print("Mist�? ");
        int mista = lukija.nextInt();

        System.out.print("Mihin? ");
        int mihin = lukija.nextInt();

        lukija.close();

        // TODO: T�ydenn� koodia teht�v�nannon mukaisesti
        while (mista <= mihin) {
        	
        	System.out.println(luvut.get(mista));
        	mista ++;
        	
        }
       
        
    }
}
