package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author : Ramkrishna Sheral
 * @version : 1.0
 * @Since : 29/10/2021
 */

public class QuantityTest {
    /**
     * Test to check 0 Feet and 0 Feet are Equal
     *
     * @return Both Feet Values are equal
     */
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    /**
     * Test to check 0 Feet and 1 Feet are Not Equal
     *
     * @return Both Feet Values are not equal
     */
    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    /**
     * Test Of Feet for Equality of Null Check
     *
     * @return Both Feet Values  are not equal
     */
    @Test                                                                 //NULL CHECK
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    /**
     * Test Of Feet for Equality of Reference Check
     *
     * @return Feet Reference are True
     */
    @Test                                                                 //REFERENCE CHECK
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    /**
     * Test of Feet for Equality of Different Reference Check are Not Equal
     *
     * @return Both Feet Reference are False
     */
    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    /**
     * Test Of Feet for Equality of Same Type Check
     *
     * @return Both Feet Values are equal
     */
    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    /**
     * Test Of Feet for Equality of Different Type Check
     *
     * @return Both Feet Values are not Same
     */
    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    /**
     * Test Of Feet for Equality Check
     *
     * @return Both Feet Values are True
     */
    @Test                                                                               //Equality Check //
    public void givenFeetWithEqualityCheck_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean equality = feet1.equals(feet2);
        Assertions.assertTrue(equality);
    }

    /**
     * Test Of Given 0 Feet Value and 1 Feet value are Not Equal
     *
     * @return Both Feet values are not equal
     */
    @Test
    public void givenFeet_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        boolean notequality = feet1.equals(feet2);
        Assertions.assertFalse(notequality);
    }

    /**
     * Test to check 0 Inch and 0 Inch are Equal
     *
     * @return Both Inch Values are equal
     */
    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    /**
     * Test to check 0 Inch and 1 Inch are Not Equal
     *
     * @return Both Inch Values are not equal
     */
    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    /**
     * Test of Inch Equality for Null check
     *
     * @return Both Inch Values are not equal
     */
    @Test                                                                           //Null Check - Inch
    public void givenNullInch_WhenCompare_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    /**
     * Test of Inch Equality for Refernce check
     *
     * @return Both Inch Reference  are True
     */
    @Test                                                                             //Reference Check - Inch
    public void givenInchWithSameReference_WhenCompared_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        boolean samerefernece = inch1 == inch1;
        Assertions.assertTrue(samerefernece);
    }

    /**
     * Test of Inch Equality for Different Refernce check
     *
     * @return Both Inch Reference are False
     */
    @Test
    public void givenInchWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Inch inch = new Inch(0.0);
        Inch inch1 = new Inch(0.0);
        boolean differentReference = inch == inch1;
        Assertions.assertFalse(differentReference);
    }

    /**
     * Test of Inch Equality for Same Type check
     *
     * @return Both Inch Reference are Equal
     */
    @Test                                                                           //Type Check - Inch
    public void givenInchWithSameType_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    /**
     * Test of Inch Equality for Different Type check
     *
     * @return Both Inch Reference are Not Same
     */
    @Test
    public void givenInchWithDifferentType_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    /**
     * Test of Inch Equality  check
     *
     * @return Both Inch values are Equal
     */
    @Test                                                                               //Equality Check - Inch
    public void givenInchWithEqualityCheck_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean equality = inch1.equals(inch2);
        Assertions.assertTrue(equality);
    }

    /**
     * Test of Inch Equality  check
     *
     * @return Both Inch values are False
     */
    @Test
    public void givenInch_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        boolean notequality = inch1.equals(inch2);
        Assertions.assertFalse(notequality);
    }

    /**
     * Test of 1Feet And 12Inch are Equal
     *
     * @return 1Feet And 12Inch are Equal
     */

    @Test                                                                               //UC1 1ft = 12Inch //
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        Feet feet = new Feet(1.0);
        double actual = feet.getFeetToInch();
        Assertions.assertEquals(actual, 12);
    }

    /**
     * Test of 3Feet And 1Yard are Equal
     *
     * @return 3Feet And 1Yard are Equal
     */
    @Test                                                                                //UC2 3ft = 1Yard//
    public void given3FeetAnd1Yard_ShouldReturnEqual() {
        Feet feet = new Feet(3.0);
        double actual = feet.getFeetToYard();
        Assertions.assertEquals(actual, 1.0);

    }

    /**
     * Test of 1Feet And 1Yard are  not Equal
     *
     * @return 1Feet And 1Yard are not Equal
     */
    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(1.0);
        Yard yard1 = new Yard(1.0);
        Assertions.assertNotEquals(feet1, yard1);
    }

    /**
     * Test of 1Inch And 1Yard are  not Equal
     *
     * @return 1Inch And 1Yard are not Equal
     */
    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(1.0);
        Yard yard1 = new Yard(1.0);
        Assertions.assertNotSame(inch1, yard1);
    }

    /**
     * Test of 1Yard And 36Inch are  Equal
     *
     * @return 1Yard And 36Inch are  Equal
     */
    @Test
    public void given1YardAnd36Inch_ShouldReturnEqual() {
        Yard yard = new Yard(1.0);
        double actual = yard.getYardToInch();
        Assertions.assertEquals(actual, 36.0);
    }

    /**
     * Test of 36Inch And 1Yard are Equal
     *
     * @return 36Inch And 1Yard are Equal
     */
    @Test
    public void given36InchAnd1Yard_ShouldReturnEqual() {
        Inch inch1 = new Inch(36.0);
        double actual = inch1.getInchToYard();
        Assertions.assertEquals(actual, 1.0);
    }

    /**
     * Test of 2Inch And 5Centimeter are Equal
     *
     * @return 2Inch And 5Centimeter are Equal
     */
    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqual() {
        Inch inch = new Inch(2.0);
        double actual = inch.getInchToCentimeter();
        Assertions.assertEquals(actual, 5.0);
    }
}
