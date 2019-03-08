package ac.za.cput.assignment2foradpwithspring;

import ac.za.cput.assignment2foradpwithspring.configuration.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTest {

    private CalculatorInterface calc;

    @Before
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calc = (CalculatorInterface)ctx.getBean("calc");

    }

    @After
    public void tearDown() throws Exception{

    }
    @Test
    public void add() throws Exception{
        int result = calc.multiply(5,5);
        Assert.assertEquals(result,25);


    }
}
