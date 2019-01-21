package DiaDeLosMuertos;

public class Ninio {
    private Traje traje;
    private Maquillaje maquillaje;
    private int actitud;
    private int dulces;
    private String nombre;

    public Ninio(Traje traje, Maquillaje maquillaje, int actitud, String nombre) {
        this.traje = traje;
        this.maquillaje = maquillaje;
        this.actitud = actitud;
        this.nombre = nombre;
    }

    protected int capacidadDeSusto() {
        return (traje.getSusto() + maquillaje.getSusto()) * actitud;
    }

    public void intentarAsustar(Adulto adulto) {
        if (adulto.recibirSusto(capacidadDeSusto()) == 0) {
            System.out.println("El adulto no se asustó");
        } else {
            recibirCaramelos(adulto.recibirSusto(capacidadDeSusto()));
        }
    }

    public void comer(int cantidad) throws CaramelosInsuficientesException {
        if (cantidad <= dulces) {
            dulces -= cantidad;
        } else {
            throw new CaramelosInsuficientesException();
        }
    }

    protected void recibirCaramelos(int cantidad) {
        dulces += cantidad;
    }

    public class CaramelosInsuficientesException extends Exception {
        public String getMessage() {
            return "La cantidad de caramelos que se posee es inferior a la demandada";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoderDeSusto() {
        return capacidadDeSusto();
    }

    public int getDulces() {
        return dulces;
    }
}
