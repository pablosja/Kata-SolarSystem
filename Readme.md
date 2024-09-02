+--------------------+     +-------------------------------+     +-------------------------------+
|    <<enumeration>> |     |           Planet               |     |            App                 |
|    PlanetType      |     +-------------------------------+     +-------------------------------+
+--------------------+     | - name: String                 |     |                               |
| + TERRESTRIAL      |     | - numberOfSatellites: int      |     | + main(args: String[]): void  |
| + GAS_GIANT        |     | - mass: double                 |     +-------------------------------+
| + DWARF            |     | - volume: double               |
+--------------------+     | - diameter: int                |
                           | - averageDistanceFromSun: int  |
                           | - type: PlanetType             |
                           | - visibleToTheEye: boolean     |
                           +-------------------------------+
                           | + Planet(name: String,         |
                           |         numberOfSatellites: int, |
                           |         mass: double,          |
                           |         volume: double,        |
                           |         diameter: int,         |
                           |         averageDistanceFromSun: int, |
                           |         type: PlanetType,      |
                           |         visibleToTheEye: boolean) |
                           | + getName(): String            |
                           | + getNumberOfSatellites(): int |
                           | + getMass(): double            |
                           | + getVolume(): double          |
                           | + getDiameter(): int           |
                           | + getAverageDistanceFromSun(): int |
                           | + getType(): PlanetType        |
                           | + isVisibleToTheEye(): boolean |
                           | + calculateDensity(): double   |
                           | + isOuterPlanet(): boolean     |
                           +-------------------------------+
