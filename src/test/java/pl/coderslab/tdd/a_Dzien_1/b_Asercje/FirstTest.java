package pl.coderslab.tdd.a_Dzien_1.b_Asercje;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {

    @Test
    public void concatString() {
        //given
        First first = new First();
        //when
        String concatString = first.concatString("one", "two");
        //then
        assertEquals("onetwo",concatString);
    }

    @Test
    public void given2and3_whenMultiple_thenResult6() {
        //given
        First first = new First();
        //when
        int multiply = first.multiply(2, 3);
        //then
        assertEquals(6,multiply);

    }
}