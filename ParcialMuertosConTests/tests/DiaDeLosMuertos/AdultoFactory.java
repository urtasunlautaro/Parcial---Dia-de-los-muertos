package DiaDeLosMuertos;

public class AdultoFactory {
    /**
    private Adulto adultoComunMiedoso = new AdultoComun(10);
    private Adulto adultoComunValiente = new AdultoComun(25);
    private Adulto abuelo = new Abuelo(5);
    private Adulto adultoNecio = new AdultoNecio(3);
   */
    private static Adulto adultoComunMiedoso = initAdultoComunMiedoso();
    private static Adulto adultoComunValiente = initAdultoComunValiente();
    private static Adulto abuelo = initAbuelo();
    private static Adulto adultoNecio = initAdultoNecio();


    public static Adulto getAdultoComunMiedoso() {
        return initAdultoComunMiedoso();
    }

    public static Adulto getAdultoComunValiente() {
        return initAdultoComunValiente();
    }

    public static Adulto getAbuelo() {
        return initAbuelo();
    }

    public static Adulto getAdultoNecio() {
        return initAdultoNecio();
    }

    private static Adulto initAdultoComunMiedoso() {
        return new AdultoComun(10);
    }

    private static Adulto initAdultoComunValiente() {
        return new AdultoComun(25);
    }

    private static Adulto initAbuelo() {
        return new Abuelo(5);
    }

    private static Adulto initAdultoNecio() {
        return new AdultoNecio(3);
    }

}
