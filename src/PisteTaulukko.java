public class PisteTaulukko {

    private int pisteet;

    public PisteTaulukko() {
        this.pisteet = 0;

    }

    public int getPisteet() {

        return pisteet;
    }

    public void setPisteet(int pisteet) {

        this.pisteet = pisteet;
    }

    public void lisaaPiste (){
        this.pisteet++;

    }
}

