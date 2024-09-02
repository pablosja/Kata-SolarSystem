package kata_solar_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlanetTypeTest {

    @Test
    void testValueOf() {
        assertEquals(PlanetType.TERRESTRIAL, PlanetType.valueOf("TERRESTRIAL"));
        assertEquals(PlanetType.GAS_GIANT, PlanetType.valueOf("GAS_GIANT"));
        assertEquals(PlanetType.DWARF, PlanetType.valueOf("DWARF"));
    }

    @Test
    void testValues() {
        PlanetType[] expected = {PlanetType.TERRESTRIAL, PlanetType.GAS_GIANT, PlanetType.DWARF};
        PlanetType[] actual = PlanetType.values();
        assertArrayEquals(expected, actual);
    }
}
