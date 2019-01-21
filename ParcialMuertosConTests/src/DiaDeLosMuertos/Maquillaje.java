package DiaDeLosMuertos;

public class Maquillaje implements Disfraz {
    private static int susto = 3;

    public int getSusto() {
        return susto;
    }

    public static void setSusto(int susto) {
        Maquillaje.susto = susto;
    }

}
