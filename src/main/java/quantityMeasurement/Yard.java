package quantityMeasurement;

public class Yard {
    private static final double INCH = 36.0;
    private final double value;

    public Yard(double value) {
        this.value = value;
    }


    public double getYardToInch() {
        double conversion = value * INCH ;
        return conversion;
    }
}
