package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                 //NULL CHECK
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                 //REFERENCE CHECK
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test                                                                               //Equality Check //
    public void givenFeetWithEqualityCheck_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean equality = feet1.equals(feet2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void givenFeet_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        boolean notequality = feet1.equals(feet2);
        Assertions.assertFalse(notequality);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test                                                                           //Null Check - Inch
    public void givenNullInch_WhenCompare_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test                                                                             //Reference Check - Inch
    public void givenInchWithSameReference_WhenCompared_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        boolean samerefernece = inch1 == inch1;
        Assertions.assertFalse(samerefernece);
    }

    @Test
    public void givenInchWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        boolean differentReference = inch == inch1;
        Assertions.assertTrue(differentReference);
    }

}
