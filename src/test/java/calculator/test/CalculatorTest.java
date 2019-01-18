package calculator.test;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.MyDataReader;

import java.io.IOException;

public class CalculatorTest {

    @Test
    public void addTest() throws Exception {

        Calculator calculator = new Calculator();

        int actual = calculator.add(4, 4);

        int expected = 8;

        Assert.assertEquals(actual, expected);

        System.out.println("*******addTest() passed*******");


    }


}
