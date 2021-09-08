import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void sumTest(){
        System.out.println(1);
        Assert.assertEquals(calculator.sum(2, 5), 7);
    }

    @Test
    public void diffTest(){
        System.out.println(2);
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.diff(2, 5), -3);
    }

    @Test
    public void mulTest(){
        System.out.println(3);
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.mul(2, 5), 10);
    }

    @Test
    public void divTest(){
        System.out.println(4);
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(20, 5), 4);
    }

    @BeforeMethod
    public void asd(){
        calculator = new Calculator();
    }

    @BeforeTest
    public void asd1(){
        System.out.println("beforeTest");
    }

    @AfterMethod
    public void asd2(){
        System.out.println("afterMethod");
    }

    @AfterTest
    public void asd3(){
        System.out.println("afterTest");
    }
}