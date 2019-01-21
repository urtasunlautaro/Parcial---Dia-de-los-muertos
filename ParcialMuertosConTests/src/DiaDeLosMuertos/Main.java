package DiaDeLosMuertos;

public class Main {
    public static void main(String[] args) throws Ninio.CaramelosInsuficientesException {

        Ninio deLaCruz = new Ninio(new TrajeTerrorifico(),
                                   new Maquillaje(),
                                   3,
                                   "Nico De La Cruz");

        System.out.println(deLaCruz.getPoderDeSusto());


    }
}
