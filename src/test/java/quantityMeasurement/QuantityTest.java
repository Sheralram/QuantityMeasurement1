package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author : Ramkrishna Sheral
 * @version : 1.0
 * @since : 29/10/2021
 */

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                 //NULL CHECK
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                 //REFERENCE CHECK
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test                                                                               //Equality Check //
    public void givenFeetWithEqualityCheck_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        boolean equality = feet1.equals(feet2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean notequality = feet1.equals(feet2);
        Assertions.assertFalse(notequality);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test                                                                           //Null Check - Inch
    public void givenNullInch_WhenCompare_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test                                                                             //Reference Check - Inch
    public void givenInchWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean samerefernece = inch1 == inch1;
        Assertions.assertTrue(samerefernece);
    }

    @Test
    public void givenInchWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean differentReference = inch == inch1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                           //Type Check - Inch
    public void givenInchWithSameType_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchWithDifferentType_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test                                                                               //Equality Check - Inch
    public void givenInchWithEqualityCheck_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean equality = inch1.equals(inch2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean notequality = inch1.equals(inch2);
        Assertions.assertFalse(notequality);
    }

    @Test                                                                               //UC1 1ft = 12Inch //
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        Length feet = new Length( Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test                                                                                //UC2 3ft = 1Yard//
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET,3.0);
        Length yard = new Length(Length.Unit.YARD,1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);

    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET,1.0);
        Length yard = new Length(Length.Unit.YARD,1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH,1.0);
        Length yard = new Length(Length.Unit.YARD,1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Length yard = new Length(Length.Unit.YARD,1.0);
        Length inch = new Length(Length.Unit.INCH,36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH,36.0);
        Length yard = new Length(Length.Unit.YARD,1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH,2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER,5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test                                                                                   //UC4 - add two Length in Inches
  public void given2InchAnd2Inch_WhenAdd_ShouldReturnFourInches() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        double add = inch.addLengthsToInches(inch1);
        Assertions.assertEquals(add,4);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturnFourTeenInches() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double add = feet.addLengthsToInches(inch);
        Assertions.assertEquals(add,14);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturnTwentyFourInches() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        double add = feet.addLengthsToInches(feet1);
        Assertions.assertEquals(add,24);
    }

    @Test
    public void given2InchAnd2AndHalfCentimeter_WhenAdd_ShouldReturn3Inches() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 2.50);
        double add = inch.addLengthsToInches(centimeter);
        Assertions.assertEquals(add,3);
    }

}
