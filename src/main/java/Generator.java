import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Generator {

    public static Ergebnis gen(int anzahlKnoten, int anzahlKanten, int maxGewicht) {
        Ergebnis ergebnis = new Ergebnis();
        Random random = new Random();
        for (int i = 0; i < anzahlKnoten; i++) {
            ergebnis.knoten.add(new Knoten(i+""));
        }
        List<Knoten> knotenList = new ArrayList<>(ergebnis.knoten);
        for (Knoten knoten : ergebnis.knoten) {
            Knoten k2 = null;
            while (k2 == null || k2 == knoten)
                    k2= knotenList.get(random.nextInt(knotenList.size()));
            ergebnis.kanten.add(new Kante(knoten, k2, random.nextInt(maxGewicht)+1));
        }
        for (int i = 0; ergebnis.kanten.size() < anzahlKanten && i < anzahlKanten*ergebnis.knoten.size(); i++) {
            Knoten k1 = knotenList.get(random.nextInt(knotenList.size()));
            Knoten k2 = knotenList.get(random.nextInt(knotenList.size()));
            while (k2 == k1) {
                k2 = knotenList.get(random.nextInt(knotenList.size()));
            }
            ergebnis.kanten.add(new Kante(k1, k2, random.nextInt(maxGewicht)+1));
        }
        return ergebnis;
    }
}
