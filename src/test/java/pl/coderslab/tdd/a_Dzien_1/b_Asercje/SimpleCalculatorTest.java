package pl.coderslab.tdd.a_Dzien_1.b_Asercje;

import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void add() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPositve() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addPositve(-90, 30);
    }
}