package quantitymeasurement;

/**
 * @author : Ramkrishna Sheral
 * @version : 1.0
 * @since : 29/10/2021
 */
public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double FEET_TO_YARD = 3.0;
    private static final double INCH_TO_CENTIMETERS = 2.50;
    private static final double GALLON_TO_LITRES = 3.78;
    private static final double LITRES_TO_MILLILITRE = 1000;
    private static final double KILOGRAM_TO_GRAM = 1000;
    private static final double TONNE_TO_KILOGRAM = 1000;

    private final Unit unit;
    private final double value;

    /**
     * @param unit
     * @param value
     */
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * @param length1 is getting Value And Converting to the required Base Unit Conversion
     * @param length2 is getting Value And Converting to the required Base Unit Conversion
     * @return Comparison between Two Lengths
     */
    public static boolean compare(Length length1, Length length2) {
        return Double.compare(length1.getValue() * length1.getUnit().baseUnitConversion, length2.getValue() * length2.getUnit().baseUnitConversion) == 0;
    }

    /**
     * @param length1 is getting Value And Converting to the required Base Unit Conversion
     * @param length2 is getting Value And Converting to the required Base Unit Conversion
     * @return Addition of Two Lengths
     */

    public static double addLengthsToInches(Length length1, Length length2) {
        return length1.getValue() * length1.getUnit().baseUnitConversion + length2.getValue() * length2.getUnit().baseUnitConversion;
    }

    /**
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * @param that
     * @return
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }


}
