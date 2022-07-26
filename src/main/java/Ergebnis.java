import lombok.ToString;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ergebnis {
    public Set<Kante> kanten = new HashSet<>();
    public Set<Knoten> knoten = new HashSet<>();

    @Override
    public String toString() {
        StringBuilder kantenString = new StringBuilder(System.lineSeparator());
        kanten.stream().map(Kante::toString).sorted(Comparator.naturalOrder()).forEachOrdered( string -> kantenString.append(string).append(System.lineSeparator()));
        return "Ergebnis{" +
                "kanten=" + kantenString.toString() +
                '}';
    }
}
