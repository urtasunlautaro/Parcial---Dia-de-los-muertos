package DiaDeLosMuertos;

import junit.framework.TestCase;

public class NinioTestCase extends TestCase {

    private Ninio mequetrefe = NinioFactory.getDeLaCruz();
    private Adulto adultoComunMiedoso = AdultoFactory.getAdultoComunMiedoso();



    public void testAlgoritmoPoderDeSusto() {
        assertEquals(24, mequetrefe.getPoderDeSusto());
    }

    public void testSiElNinioLograAsustarObtieneCaramelos() {
        mequetrefe.intentarAsustar(adultoComunMiedoso);
        assertTrue(mequetrefe.getDulces() != 0);
    }

    public void testSiElNinioComeCaramelosYTieneSuficienteCantidadSeReduce() throws Ninio.CaramelosInsuficientesException {
        mequetrefe.intentarAsustar(adultoComunMiedoso);
        int cantidadOriginal = mequetrefe.getDulces();
        int dulcesComidos = 2;
        mequetrefe.comer(dulcesComidos);
        assertTrue((cantidadOriginal - dulcesComidos ) == mequetrefe.getDulces());
    }

    public void testSiElNinioComeCaramelosYNoTieneSuficienteCantidadLanzaException() {
        try {
            mequetrefe.comer(50);
            fail("Missing Exception");
        } catch (Ninio.CaramelosInsuficientesException e) {
            assertEquals("La cantidad de caramelos que se posee es inferior a la demandada", e.getMessage());
        }
    }



}
