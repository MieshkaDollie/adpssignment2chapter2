package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

import static com.sun.javafx.fxml.expression.Expression.multiply;

public class CalculatorTest {
    private Calculator c = new Calculator();

    @Test
    public void multiplyTest(){

        int result=c.multiply(2,1);

        Assert.assertEquals(result,2);

    }
}
