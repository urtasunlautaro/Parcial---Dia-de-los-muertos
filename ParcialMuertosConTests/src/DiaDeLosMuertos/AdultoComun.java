package DiaDeLosMuertos;

class AdultoComun extends Adulto {

    public AdultoComun(int tolerancia) {
        super(tolerancia);
    }

    boolean seAsusta(int capacidadDeSusto) {
        return tolerancia < capacidadDeSusto;
    }

    public int darDulces() {
        return tolerancia / 2;
    }
}
