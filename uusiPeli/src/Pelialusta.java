import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * asd
 * asd
 * asd
 */
public class Pelialusta {


    public static void main(String[] args) {
        ArrayList<Kysymys> kysymykset = new ArrayList<>();

        Kysymys q1 = new Kysymys("1. Mitä seuraava tulostaa?\n" +
                "\n" +
                "public class Main {\n" +
                "\n" +
                "   public static void main(String[] args) {\n" +
                "\n" +
                "       int i = 0;\n" +
                "       i = i++ + i;\n" +
                "       System.out.println(\"I = \" + i);}\na) I = 0 b) I = 1 c) I = 2 d) Compile-time Error ", "B");
        kysymykset.add(q1);
        Kysymys q2 = new Kysymys("2. Jotta metodia ei voi ohittaa, sen pitää olla...\n" +
                "a) static b) const c) final d) ei mikään näistä", "C");
        kysymykset.add(q2);
        Kysymys q3 = new Kysymys("Mitä seuraava tulostaa?\n" +
                "\n" +
                "public class Main {\n" +
                "\n" +
                "   static int i = 1;\n" +
                "\n" +
                "   public static void main(String[] args) {\n" +
                "\n" +
                "       System.out.println(i + \" , \");\n" +
                "       m(i);\n" +
                "       System.out.println(i);\n" +
                "   }\n" +
                "\n" +
                "   public static void m(int i) {\n" +
                "       i += 2;\n" +
                "\n" +
                "   }\n" +
                "}\n" +
                "\n" +
                "a) 1,3 b) 3,1 c) 0,1 d) 1,1 ", "D");
        kysymykset.add(q3);
        Kysymys q4 = new Kysymys("4. Luokalla on aina oletuskonstruktori?\n" +
                "\n" +
                "a) True b) False", "B");
        kysymykset.add(q4);
        Kysymys q5 = new Kysymys("5. \"Konstruktorin\" voi periä?\n" +
                "\n" +
                "a) True b) False", "B");
        kysymykset.add((q5));
        Kysymys q6 = new Kysymys("6. Mitä näistä operaattoreista voidaan käyttää kahden tai useamman String-objektin ketjuttamiseen?\n" +
                "\n" +
                "a) + b) += c) & d) ||  ", "A");
        kysymykset.add(q6);
        Kysymys q7 = new Kysymys("7. Mikä on short-tyypin arvoalue?\n" +
                "\n" +
                "a) -128 to 127 b) -32768 to 32767 c) -2147483648 to 2147483647 d) ei mikään näistä", "B");
        kysymykset.add(q7);
        Kysymys q8 = new Kysymys("8. Mikä on double-tyypin koko?\n" +
                "\n" +
                "a) 16 bittiä b) 8 bittiä c) 32 bittiä d) 64 bittiä ", "D");
        kysymykset.add(q8);
        Kysymys q9 = new Kysymys("9. Mikä seuraavista on varattu avainsana?\n" +
                "\n" +
                "a) method b) native c) subclasses d) array", "B");
        kysymykset.add(q9);
        Kysymys q10 = new Kysymys("10. Java-lähdetiedoston kolmen ylätason elementin järjestys on:\n" +
                "\n" +
                "a) Import, Package, Class b) Class, Import, Package, c) Package, Import, Class, d) ei mikään näistä", "C");
        kysymykset.add(q10);
        takeQuiz(kysymykset);
    }


    public static void takeQuiz(ArrayList<Kysymys> kysymykset) {
        Scanner lukija = new Scanner(System.in);
        int pisteet = 0;

        System.out.println("Tietovisa: JAVA \n");
        System.out.println("Syötä käyttäjänimi: ");
        Kayttaja uusi = new Kayttaja(lukija.nextLine());

        System.out.println("Terve " + uusi.getNimi() + "! \nPeli alkaa:");

        while (kysymykset.size() != 0) {
            Collections.shuffle(kysymykset);
            System.out.println(kysymykset.get(0));
            System.out.println("Anna vastaus: ");
            String v1 = lukija.nextLine();
            if (v1.equalsIgnoreCase(kysymykset.get(0).getAnswer())) {
                System.out.println("Oikein!");
                pisteet++;
                kysymykset.remove(0);
            } else if (!(v1.equalsIgnoreCase(kysymykset.get(0).getAnswer()))) {
                System.out.println("Väärä vastaus.");
                continue;

            }
            System.out.println("Pisteesi on nyt; " + pisteet);


        }
        System.out.println("Peli päättyi, sait kaikki oikein!");

    }
}


