package Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void calculatorIsNotNull(){
        assertNotNull(calculator);
    }

    @Test
    void calculatorCanAddTest(){
        assertEquals(4,calculator.add(2,2));
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void calculatorCanAddDoubleTest(){
        assertEquals(14.3, calculator.add(6.2, 8.1));
    }


}