package DiaDeLosMuertos;

class Abuelo extends Adulto {

    public Abuelo(int tolerancia) {
        super(tolerancia);
    }

    public boolean seAsusta(int capacidadDeSusto) {
        return true;
    }

    int darDulces() {
        return (tolerancia / 2) / 2;
    }
}
