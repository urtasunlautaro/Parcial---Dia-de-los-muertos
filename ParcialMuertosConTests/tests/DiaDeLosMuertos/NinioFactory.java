package DiaDeLosMuertos;

public class NinioFactory {

    private static Ninio deLaCruz = initNicoDeLaCruz();
    private static Ninio arcoiris = initJuanitoArcoiris();
    private static Ninio vanHouten = initVanHouten();

    public static Ninio getDeLaCruz() {
        return deLaCruz;
    }

    public static Ninio getArcoiris() {
        return arcoiris;
    }

    public static Ninio getVanHouten() {
        return vanHouten;
    }

    private static Ninio initNicoDeLaCruz() {
        return new Ninio(new TrajeTerrorifico(),
                new Maquillaje(),
                3,
                "Nico De La Cruz");
    }

    private static Ninio initJuanitoArcoiris() {
        return new Ninio(new TrajeTierno(),
                         new Maquillaje(),
                7,
                "Juanito Arcoiris");

    }

    private static Ninio initVanHouten() {
        return new Ninio(new TrajeTierno(),
                         new Maquillaje(),
                        4,
                        "Milhouse Van Houten");
    }
}
