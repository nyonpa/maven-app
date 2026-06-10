package com.test;
import com.maven.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    Calculator c=new Calculator();
    @Test
    void testCal()
    {

        int expectedResult = 2;
        assertEquals(expectedResult, c.div(10,5));

    }
}
