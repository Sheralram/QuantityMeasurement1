package quantityMeasurement;
/**
 * @author : Ramkrishna Sheral
 * @version : 1.0
 * @since : 29/10/2021
 */
public class Yard {
    private static final double INCH = 36.0;
    private final double value;

    public Yard(double value) {
        this.value = value;
    }

    /**
     * Method To Convert Yard to Inch
     *
     * @return Conversion Value
     */

    public double getYardToInch() {
        double conversion = value * INCH ;
        return conversion;
    }
}
