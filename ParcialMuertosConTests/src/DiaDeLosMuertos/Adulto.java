package DiaDeLosMuertos;

abstract class Adulto {
    protected int tolerancia;

    public Adulto(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public int getTolerancia() {
        return tolerancia;
    }

    abstract boolean seAsusta(int capacidadDeSusto);
    abstract int darDulces();

    int recibirSusto(int capacidadDeSusto) {
        return seAsusta(capacidadDeSusto) ? darDulces() : 0;
    }

}
