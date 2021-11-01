package quantityMeasurement;
/**
 * @author : Ramkrishna Sheral
 * @version : 1.0
 * @since : 29/10/2021
 */

public class Feet {
    private static final double INCH = 12.0 ;
    private static final double YARD = 3.0 ;
    private final double value;

    public Feet(double value) {
        this.value = value;
    }
    /**
     * Method To Convert Feet to Inch
     *
     * @return Conversion Value
     */
    public double getFeetToInch() {
        double conversion = value * INCH;
        return conversion;
    }
    /**
     * Method To Convert Feet to Yard
     *
     * @return Conversion Value
     */
    public double getFeetToYard() {
        double conversion1 = value / YARD;
        return conversion1;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}
