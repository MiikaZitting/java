package viikko05;

public class Artist {

    private String name;
    private int yearOfBirth;

    public Artist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
    	return this.name;
        // Kirjoita tämän metodin toteutus
    }

    public void setName(String name) {
    	this.name = name;
        // Kirjoita tämän metodin toteutus
    }

    public int getYearOfBirth() {
    	return this.yearOfBirth;
        // Kirjoita tämän metodin toteutus
    }

    public void setYearOfBirth(int yearOfBirth) {
    	this.yearOfBirth = yearOfBirth;
        // Kirjoita tämän metodin toteutus
    }

    @Override
    public String toString() {
        return this.name;
    }
}