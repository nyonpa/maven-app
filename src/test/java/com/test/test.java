package com.test;
import com.maven.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void testCal()
    {
        Calculator c=new Calculator();
        int actualResult = c.div(10,5);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);

    }
}
