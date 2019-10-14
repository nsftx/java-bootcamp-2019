package ba.spark.bootcamp.UnitTests;

import ba.spark.bootcamp.unitTests.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalculatorTest {

    @Test
    public void shouldReturnSum(){
        Assert.assertEquals(2, Calculator.sum(-5,7));
    }

    @Test(expected = AssertionError.class)
    public void shouldReturnQuotient(){
        Assert.assertEquals(2.0, Calculator.quotient(2, 0), 0.00001);
    }

}
