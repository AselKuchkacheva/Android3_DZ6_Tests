package com.example.android3_dz6_tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    Math math;

    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }

    @Test
    public void addTest() {
        assertEquals(6, math.add(3, 3));
        System.out.println("Add test");
    }

    @Test
    public void multiplyTest() {
        assertEquals(6, math.multiply(3, 2));
        System.out.println("Multiply test");

    }

    @Test
    public void divTest() {
        assertEquals(2, math.div(4, 2));
        System.out.println("Division test");
    }

    @Test
    public void minusTest() {
        assertEquals(2, math.minus(4, 2));
        System.out.println("Minus test");
    }

    @Test
    public void degreeTest() {
        assertEquals(16, math.degree(4, 2));
        System.out.println("Degree test");
    }

    @Test
    public void rootTest() {
        assertEquals(3, math.root(9));
        System.out.println("root test");

    }

    @After
    public void clearUp() {
        System.out.println("After");
    }
}

