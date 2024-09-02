package kata_solar_system;

public class App {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 1, PlanetType.TERRESTRIAL, true);
        Planet pluto = new Planet("Pluto", 5, 1.303e22, 7.057e9, 2376, 39, PlanetType.DWARF, false);

        System.out.println("Planet: " + earth.getName());
        System.out.println("Number of Satellites: " + earth.getNumberOfSatellites());
        System.out.println("Mass: " + earth.getMass() + " kg");
        System.out.println("Volume: " + earth.getVolume() + " km^3");
        System.out.println("Diameter: " + earth.getDiameter() + " km");
        System.out.println("Average Distance from Sun: " + earth.getAverageDistanceFromSun() + " million km");
        System.out.println("Type: " + earth.getType());
        System.out.println("Visible to the Eye: " + earth.isVisibleToTheEye());
        System.out.println("Density: " + earth.calculateDensity() + " kg/km^3");
        System.out.println("Is Outer Planet: " + earth.isOuterPlanet());

        System.out.println();

        System.out.println("Planet: " + pluto.getName());
        System.out.println("Number of Satellites: " + pluto.getNumberOfSatellites());
        System.out.println("Mass: " + pluto.getMass() + " kg");
        System.out.println("Volume: " + pluto.getVolume() + " km^3");
        System.out.println("Diameter: " + pluto.getDiameter() + " km");
        System.out.println("Average Distance from Sun: " + pluto.getAverageDistanceFromSun() + " million km");
        System.out.println("Type: " + pluto.getType());
        System.out.println("Visible to the Eye: " + pluto.isVisibleToTheEye());
        System.out.println("Density: " + pluto.calculateDensity() + " kg/km^3");
        System.out.println("Is Outer Planet: " + pluto.isOuterPlanet());
    }
}
