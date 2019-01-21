package DiaDeLosMuertos;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LegionTestCase extends TestCase {

    private Ninio deLaCruz = NinioFactory.getDeLaCruz();
    private Ninio arcoiris = NinioFactory.getArcoiris();
    private Ninio vanHouten = NinioFactory.getVanHouten();
    private List<Ninio> ninios = new ArrayList<>(Arrays.asList(deLaCruz, arcoiris, vanHouten));

    private Adulto adultoComunMiedoso = AdultoFactory.getAdultoComunMiedoso();

    private Legion legion = new Legion(ninios);

    public void testLaCapacidadDeAsustarDeLaLegionEsLaSumaDeLaDeSusMiembros() {
        assertEquals((deLaCruz.capacidadDeSusto() + arcoiris.capacidadDeSusto() + vanHouten.capacidadDeSusto()), legion.capacidadDeSusto());
    }

    public void testElLiderDeLaLegionEsElQueTieneLaMayorCapacidadDeAsustar() {
        Ninio lider = legion.getLider();
        if (lider != deLaCruz) {
            assertTrue(lider.capacidadDeSusto() > deLaCruz.capacidadDeSusto());
        }
        if (lider != arcoiris) {
             assertTrue(lider.capacidadDeSusto() > arcoiris.capacidadDeSusto());
        }
        if (lider != vanHouten) {
            assertTrue(lider.capacidadDeSusto() > vanHouten.capacidadDeSusto());
        }
    }

    public void testLaLegionPuedeAsustarAUnAdulto() {
        assertTrue(adultoComunMiedoso.seAsusta(legion.capacidadDeSusto()));
    }

    public void testLosCaramelosSeLosQuedaElLider() {
        Ninio lider = legion.getLider();
        legion.intentarAsustar(adultoComunMiedoso);
        int arcasDelLider = lider.getDulces();
        assertTrue(arcasDelLider > 0);
    }

    public void testLosSustosSeRegistranEnUnMapa() {
        legion.intentarAsustar(adultoComunMiedoso);
        assertTrue(!legion.getRegistroDeSustos().isEmpty());
    }

    public void testElRegistroDevuelveLaCantidadDeSustos() {
        legion.intentarAsustar(adultoComunMiedoso);
        assertEquals(1, legion.sustosTotalesDados());
    }


}
