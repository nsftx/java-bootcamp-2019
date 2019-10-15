package ba.spark.bootcamp.UnitTests;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnSum() {
        Assert.assertEquals(2, Calculator.sum(-5, 7));
    }

    @Test(expected = AssertionError.class)
    public void shouldReturnQuotient() {
        Assert.assertEquals(2.0, Calculator.quotient(2, 0), 0.00001);
    }

}
