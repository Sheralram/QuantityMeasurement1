package quantityMeasurement;

public class QuantityMeasurementMain {
    public boolean inchConversion(double feet, int inch) {
        double result = feet * 12;
        if (result == inch) {
            return true;
        }
        return false;
    }

    public boolean yardConversion(double feet, double yard) {
        double result = yard * 3;
        if (result == feet) {
            return true;
        }
        return false;
    }

    public boolean yardToInchConversion(double yard, double inch) {
        return false;
    }
}
