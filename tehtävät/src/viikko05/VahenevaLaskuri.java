package viikko05;

public class VahenevaLaskuri {
	
	private int arvo = 0;

public VahenevaLaskuri(int arvoAlussa) {
    this.arvo = arvoAlussa;
}

public void tulostaArvo() {
    System.out.println("arvo: " + this.arvo);
}

public void vahene() {
    // kirjoita t�nne metodin toteutus
    // laskurin arvon on siis tarkoitus v�henty� yhdell�
    if (arvo > 0) {
        this.arvo --;
    }
}
public void nollaa() {
    this.arvo = 0;
}
// ja t�nne muut metodit
}
