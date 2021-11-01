package quantityMeasurement;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double FEET_TO_YARD = 3.0;
    private static final double INCH_TO_CENTIMETERS = 2.50 ;

    enum Unit {FEET, INCH, YARD, CENTIMETER}

    private final Unit unit;
    private final double value;

    /**
     *
     * @param unit
     * @param value
     */
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    /**
     *
     * @param that compairing the Units
     * @return true if the units are same
     */

    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * FEET_TO_YARD) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value* INCH_TO_CENTIMETERS, that.value ) == 0;
        return false;
    }

    /**
     *
     * @param value the value is converted into Inches
     * @return Adding the unit values in Inches
     */
    public double addLengthsToInches(Length value) {
        if (this.unit.equals(Unit.INCH)&&(value.unit.equals(Unit.INCH)))
            return this.value + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.INCH))
            return (this.value * FEET_TO_INCH) + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.FEET))
            return (this.value * FEET_TO_INCH) + (value.value * FEET_TO_INCH);
        if(this.unit.equals(Unit.INCH) && value.unit.equals(Unit.CENTIMETER))
            return (this.value) + (value.value / INCH_TO_CENTIMETERS);
        return 0;
    }



}
