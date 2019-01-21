package DiaDeLosMuertos;

import junit.framework.TestCase;

public class MaquillajeTestCase extends TestCase {
    private Maquillaje unMaquillaje = new Maquillaje();

    public void testMaquillajeAsusta3() {
        assertEquals(3, unMaquillaje.getSusto());
    }

    public void testMaquillajeSePuedeModificar() {
        Maquillaje.setSusto(5);
        assertEquals(5, unMaquillaje.getSusto());
        Maquillaje.setSusto(3);
    }

    public void testMaquillajeExistenteRecibeActualizacionDeSusto() {
        int sustoAnterior = unMaquillaje.getSusto();
        Maquillaje.setSusto(10);
        assertNotSame(unMaquillaje.getSusto(), sustoAnterior);
        Maquillaje.setSusto(3);
    }
}
