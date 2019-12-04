package ru.samsungitacademy.test;

import org.junit.Before;
import org.junit.Test;
import ru.samsungitacademy.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    @Before
    public void setUp() throws Exception {
        c=new Calculator();
    }

    @Test
    public void sum() {
    }

    @Test
    public void divide() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void line() {
        assertEquals(1.15,c.line(1),0.01);
    }
}