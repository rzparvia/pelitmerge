public class Kayttaja {

    private String nimi;
    private int pisteet;

    public Kayttaja(String nimi) {
        this.nimi = nimi;
        pisteet = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getPisteet() {
        return pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    @Override
    public String toString() {
        StringBuilder uusi = new StringBuilder("Käyttäjän nimi ");
        uusi.append(nimi).append(" , Pisteet: ").append(pisteet);
        return "";
    }
}
