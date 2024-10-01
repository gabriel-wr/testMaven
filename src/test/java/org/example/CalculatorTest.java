package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
       /**
        * Method under test: {@link Calculator#Add(int, int)}
        */
       @Test
       void testAdd() {
              // Arrange, Act and Assert
              assertEquals(6, (new Calculator()).Add(3, 3));
              assertEquals(4, (new Calculator()).Add(1, 3));
              assertEquals(3, (new Calculator()).Add(0, 3));
              assertEquals(14, (new Calculator()).Add(11, 3));
       }
}
