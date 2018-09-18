import java.util.*;

public class Main {

    public static void main(String[] args) {
        KysymysLista kl = new KysymysLista();
        ArrayList<Kysymys> kysymysList = kl.getLista();
        System.out.println("Tervetuloa Java-visaan.");


        PisteTaulukko pisteet = new PisteTaulukko();

        Scanner lukija = new Scanner(System.in);
        int arvaus = 0;
        int oikeaIndeksi = 0;

        for (int i = 0; i < kysymysList.size(); i++) {
            System.out.println(kysymysList.get(i));
            oikeaIndeksi = kysymysList.get(i).getOikeanVaihtoehdonIndex();

            arvaus = Integer.parseInt(lukija.nextLine()) - 1;

            // if (arvaus != 1 && arvaus != 2 && arvaus != 3 ) {

            if (arvaus >= 0 && arvaus <= 2){


                if (arvaus == oikeaIndeksi) {
                    // lisätään piste
                    pisteet.lisaaPiste();
                    System.out.println("Oikein!");
                } else {
                    System.out.println("Väärin!");
                }

        } else{

            System.out.println("Epäkelpo vastaus!");
            continue;
        }

    }
        System.out.println("Visa päättyi. Pisteesi: " +pisteet.getPisteet());
    }
}