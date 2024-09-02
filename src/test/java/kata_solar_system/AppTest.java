package kata_solar_system;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testMain() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        App.main(new String[]{});

        String expectedOutput =
                "Planet: Earth\n" +
                "Number of Satellites: 1\n" +
                "Mass: 5.972E24 kg\n" +
                "Volume: 1.08321E12 km^3\n" +
                "Diameter: 12742 km\n" +
                "Average Distance from Sun: 1 million km\n" +
                "Type: TERRESTRIAL\n" +
                "Visible to the Eye: true\n" +
                "Density: 5.513243046131406E12 kg/km^3\n" +
                "Is Outer Planet: false\n" +
                "\n" +
                "Planet: Pluto\n" +
                "Number of Satellites: 5\n" +
                "Mass: 1.303E22 kg\n" +
                "Volume: 7.057E9 km^3\n" +
                "Diameter: 2376 km\n" +
                "Average Distance from Sun: 39 million km\n" +
                "Type: DWARF\n" +
                "Visible to the Eye: false\n" +
                "Density: 1.8463936516933542E12 kg/km^3\n" +
                "Is Outer Planet: true\n";

        System.setOut(originalOut);

        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }
}
