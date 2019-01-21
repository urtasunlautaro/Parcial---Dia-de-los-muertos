package DiaDeLosMuertos;

import junit.framework.TestCase;
public class AdultoTestCase extends TestCase {

    /**
     * Los Abuelos simulan asustarse siempre, y entregan la mitad de los caramelos de un adulto común.
     */

    private Adulto adultoComunMiedoso = AdultoFactory.getAdultoComunMiedoso();
    private Adulto adultoComunValiente = AdultoFactory.getAdultoComunValiente();
    private Adulto abuelo = AdultoFactory.getAbuelo();
    private Adulto adultoNecio = AdultoFactory.getAdultoNecio();
    private Ninio mequetrefe = NinioFactory.getDeLaCruz();


    //adulto comun
    public void testAdultoComunEsAsustadoPorNinioDeMayorCapacidadQueSuTolerancia() {
        assertTrue(adultoComunMiedoso.seAsusta(mequetrefe.capacidadDeSusto()));
    }

    public void testSiendoAdultoComunAsustadoDaTantosCaramelosComoMediaTolerancia() {
        assertEquals(adultoComunMiedoso.getTolerancia()/2,
                     adultoComunMiedoso.recibirSusto(mequetrefe.capacidadDeSusto()));
    }

    public void testAdultoComunNoEsAsustadoPorNinioDeMenorCapacidadQueSuTolerancia() {
        assertFalse(adultoComunValiente.seAsusta(mequetrefe.capacidadDeSusto()));
    }

    public void testAdultoComunNoAsustadoNoDaCaramelos() {
        assertEquals(0, adultoComunValiente.recibirSusto(mequetrefe.capacidadDeSusto()));
    }

    //abuelo
    public void testAbueloEsAsustado() {
        assertTrue(abuelo.seAsusta(mequetrefe.capacidadDeSusto()));
    }

    public void testAbueloAsustadoDaCaramelos() {
        assertEquals((abuelo.getTolerancia()/2)/2,
                      abuelo.recibirSusto(mequetrefe.capacidadDeSusto()));
    }

    //adulto necio
    public void testAdultoNecioNoEsAsustado() {
        assertFalse(adultoNecio.seAsusta(mequetrefe.capacidadDeSusto()));
    }

    public void testAdultoNecioNoDaCaramelos() {
        assertEquals(0, adultoNecio.recibirSusto(mequetrefe.capacidadDeSusto()));
    }


}
