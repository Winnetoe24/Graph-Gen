import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Kante {
    public Knoten k1,k2;
    @EqualsAndHashCode.Exclude
    public int gewicht;
}
