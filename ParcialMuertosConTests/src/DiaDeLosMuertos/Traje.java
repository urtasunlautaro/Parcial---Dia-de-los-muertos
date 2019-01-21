package DiaDeLosMuertos;

abstract public class Traje implements Disfraz {
    private int susto;

    public Traje(int susto) {
        this.susto = susto;
    }

    public int getSusto() {
        return susto;
    }
}
