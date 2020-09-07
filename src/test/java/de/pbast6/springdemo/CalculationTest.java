package de.pbast6.springdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {
    private CalculationService calculator = new CalculationService();

    @Test
    public void testSum() {
        Assertions.assertEquals(5, calculator.sum(2, 3));
    }
    @Test
    public void testSum2() {
        Assertions.assertEquals(-1, calculator.sub(2, 3));
    }
}
