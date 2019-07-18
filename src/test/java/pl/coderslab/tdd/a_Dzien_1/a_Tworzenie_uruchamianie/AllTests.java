package pl.coderslab.tdd.a_Dzien_1.a_Tworzenie_uruchamianie;


import a_Zadania.a_Dzien_1.b_Asercje.FirstTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SampleSampleTest.class, FirstTest.class })
public class AllTests {
}