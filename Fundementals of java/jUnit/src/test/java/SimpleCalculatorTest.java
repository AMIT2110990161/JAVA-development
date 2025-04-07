import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void addTwoNumbers(){
        SimpleCalculator cal = new SimpleCalculator();
        assertEquals(4, cal.add(2 ,2));
    }
    @Test
    void moreNumbers(){
        SimpleCalculator cal = new SimpleCalculator();
        assertEquals(11, cal.add(9 ,2));
    }
}