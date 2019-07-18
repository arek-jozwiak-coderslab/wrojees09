package pl.coderslab.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private final int A = 20;
    private final int B = 20;
    private final int RESULT_ADD = 40;
    private final int RESULT_MULTIPLE = 400;
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() {

        assertEquals(RESULT_ADD, calculator.add(A, B));
        assertEquals(30, calculator.add(15, 15));
    }
    @Test
    public void given20and20_whenMultiple_thenReturn400(){
       assertEquals(RESULT_MULTIPLE, calculator.multiple(A,B));
    }

}