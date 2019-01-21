package DiaDeLosMuertos;

class AdultoNecio extends Adulto {

    public AdultoNecio(int tolerancia) {
        super(tolerancia);
    }

    public boolean seAsusta(int capacidadDeSusto) {
        return false;
    }

    int darDulces() {
        return 0;
    }
}
