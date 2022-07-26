public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Gebe folgende Argumente an: AnzahlKnoten MaximaleAnzahlKanten MaximalesGewicht");
            return;
        }
        System.out.println(Generator.gen(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])).toString());
    }
}
