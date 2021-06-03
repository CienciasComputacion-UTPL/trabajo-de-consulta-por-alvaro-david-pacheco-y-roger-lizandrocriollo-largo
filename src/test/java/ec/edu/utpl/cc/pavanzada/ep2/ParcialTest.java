package ec.edu.utpl.cc.pavanzada.ep2;

import ec.edu.utpl.cc.pavanzada.ep2.dev.Parcial;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParcialTest {
    private static Parcial p;

    @BeforeAll
    public static void createParcial() {
        p = new Parcial();
    }

    @Test
    @Order(1)
    public void testPopulate() {
        p.populateDataProvinces();
        Assertions.assertEquals(24, p.getDataProvinces().size());
    }

    @Test
    @Order(2)
    public void testTotal() {
        Assertions.assertEquals(32010, p.getTotal());
    }
}
