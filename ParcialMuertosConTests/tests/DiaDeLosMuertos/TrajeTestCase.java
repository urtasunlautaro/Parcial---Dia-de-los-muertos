package DiaDeLosMuertos;

import junit.framework.TestCase;

public class TrajeTestCase extends TestCase {

    public void testTrajeTerrorificoAsusta5() {
        assertEquals(5, new TrajeTerrorifico().getSusto());
    }
    public void testTrajeTiernoAsusta2() {
        assertEquals(2, new TrajeTierno().getSusto());
    }
}
