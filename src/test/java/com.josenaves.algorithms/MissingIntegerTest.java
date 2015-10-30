package com.josenaves.algorithms;

import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MissingIntegerTest {

    private MissingInteger missingInteger;

    @Before
    public void getMissingInteger() {
        this.missingInteger = new MissingInteger();
    }

    @Test
    public void testSample() {
        assertEquals(5, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void testSample2() {
        assertEquals(11, missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2, 5, 10, 9, 7, 8}));
    }

    @Test
    public void testSample3() {
        assertEquals(1, missingInteger.solution(new int[]{4, 5, 6, 2}));
    }

    @Test
    public void testAllNegative() {
        assertEquals(1, missingInteger.solution(new int[]{-4, -5, -6, -2}));
    }

    @Test
    public void testTwoNumbersFirst() {
        assertEquals(1, missingInteger.solution(new int[]{2, 3}));
    }

    @Test
    public void testTwoNumbersTwo() {
        assertEquals(2, missingInteger.solution(new int[]{1,5}));
    }

    @Test
    public void testTwoNumbersThree() {
        assertEquals(3, missingInteger.solution(new int[]{1,2}));
    }

    @Test
    public void testOneNumberTwo() {
        assertEquals(2, missingInteger.solution(new int[]{1}));
    }

    @Test
    public void testOneNumberOne() {
        assertEquals(1, missingInteger.solution(new int[]{2}));
    }

    @Test
    public void testSeveralNumbers() {
        assertEquals(9, missingInteger.solution(new int[]{1,2,2,3,4,5,6,7,8}));
    }

    @Test
    public void testOneNumberMin() {
        assertEquals(1, missingInteger.solution(new int[]{Integer.MIN_VALUE}));
    }

    @Test
    public void testOneNumberMax() {
        assertEquals(1, missingInteger.solution(new int[]{Integer.MAX_VALUE}));
    }

    @Test
    public void testExtremes() {
        assertEquals(1, missingInteger.solution(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }
}
