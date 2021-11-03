package quantitymeasurement;

public enum Unit {
    FEET(1.0), FEET_TO_INCH(12.0), INCH(1.0), YARD_TO_INCH(36.0), CENTIMETER_TO_INCH(1 / 2.5),
    //Enums for conversions according to volumes
    LITRES(1.0), GALLON_TO_LITRE(3.78), MILLILITRE_TO_LITRE(0.001),
    //Enums for conversions according to weights
    KILOGRAM(1.0), GRAMS_TO_KILOGRAM(1.0 / 1000), TONNE_TO_KILOGRAM(1.0 * 1000),;

    public final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

}
