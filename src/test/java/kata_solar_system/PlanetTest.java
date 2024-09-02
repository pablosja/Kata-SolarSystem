package kata_solar_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlanetTest {

    @Test
    void testPlanetProperties() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 1, PlanetType.TERRESTRIAL, true);
        Planet pluto = new Planet("Pluto", 5, 1.303e22, 7.057e9, 2376, 39, PlanetType.DWARF, false);

        // Test Earth properties
        assertEquals("Earth", earth.getName());
        assertEquals(1, earth.getNumberOfSatellites());
        assertEquals(5.972e24, earth.getMass());
        assertEquals(1.08321e12, earth.getVolume());
        assertEquals(12742, earth.getDiameter());
        assertEquals(1, earth.getAverageDistanceFromSun());
        assertEquals(PlanetType.TERRESTRIAL, earth.getType());
        assertTrue(earth.isVisibleToTheEye());
        assertEquals(5.513243046131406E12, earth.calculateDensity(), 1e8); // Allow some tolerance
        assertFalse(earth.isOuterPlanet());

        // Test Pluto properties
        assertEquals("Pluto", pluto.getName());
        assertEquals(5, pluto.getNumberOfSatellites());
        assertEquals(1.303e22, pluto.getMass());
        assertEquals(7.057e9, pluto.getVolume());
        assertEquals(2376, pluto.getDiameter());
        assertEquals(39, pluto.getAverageDistanceFromSun());
        assertEquals(PlanetType.DWARF, pluto.getType());
        assertFalse(pluto.isVisibleToTheEye());
        assertEquals(1.8463936516933542E12, pluto.calculateDensity(), 1e8); // Allow some tolerance
        assertFalse(pluto.isOuterPlanet());
    }
}
