package quantityMeasurement;

public class Inch {
    private static final double YARD = 36.0 ;
    private static final double CENTIMETER = 2.5;
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    public double getInchToYard() {
        double conversion = value / YARD ;
        return conversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

    public double getInchToCentimeter() {
        double conversion = value * CENTIMETER;
        return conversion;
    }
}
