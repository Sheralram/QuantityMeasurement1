package quantityMeasurement;

public class QuantityMeasurementMain {
    public boolean inchConversion(double feet, int inch) {
        double result = feet * 12;
        if (result == inch)
        {
            return  true;
        }
        return false;
    }

    public boolean yardConversion(double feet, double yard) {
        return false;
    }
}
