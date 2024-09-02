package kata_solar_system;

public class Planet {
    public static final String PlanetType = null;
    private String name;
    private int numberOfSatellites;
    private double mass;
    private double volume;
    private int diameter;
    private int averageDistanceFromSun;
    private PlanetType type;
    private boolean visibleToTheEye;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter, int averageDistanceFromSun, PlanetType type, boolean visibleToTheEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.type = type;
        this.visibleToTheEye = visibleToTheEye;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAverageDistanceFromSun() {
        return averageDistanceFromSun;
    }

    public PlanetType getType() {
        return type;
    }

    public boolean isVisibleToTheEye() {
        return visibleToTheEye;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        final double AU_IN_KM = 149597870;
        double distanceInAU = averageDistanceFromSun / AU_IN_KM;
        return distanceInAU > 3.4;
    }
}
