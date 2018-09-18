import java.util.ArrayList;
import java.util.List;

public class Kysymys {

    private String kyssari;
    private List<String> vastaukset;
    private int oikeanVaihtoehdonIndex;

    public Kysymys(String kyssari){
        this.kyssari = kyssari;
        this.vastaukset = new ArrayList<>();

    }

    public int getOikeanVaihtoehdonIndex() {
        return oikeanVaihtoehdonIndex;
    }

    public void setOikeanVaihtoehdonIndex(int oikeanVaihtoehdonIndex) {
        this.oikeanVaihtoehdonIndex = oikeanVaihtoehdonIndex;
    }
    public void lisaaVastaus(String vastaus) {
        this.vastaukset.add(vastaus);
    }

    @Override
    public String toString() {
        return "Kysymys: " + kyssari +
                "\nVastausvaihtoehdot: " + vastaukset;
    }
}
