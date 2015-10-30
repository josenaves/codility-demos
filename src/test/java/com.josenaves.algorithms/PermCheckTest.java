package com.josenaves.algorithms;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PermCheckTest {

    private PermCheck permCheck;

    @Before
    public void setPermCheck() {
        this.permCheck= new PermCheck();
    }

    @Test
    public void testSample1() {
        assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void testSample2() {
        assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }

    @Test
    public void testSample3() {
        assertEquals(1, permCheck.solution(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testRepeatable() {
        assertEquals(0, permCheck.solution(new int[]{1, 4, 1}));
    }

    @Test
    public void testThreeTimes() {
        assertEquals(0, permCheck.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 11}));
    }

    @Test
    public void testSmallSequence() {
        final int SIZE = 10;
        assertEquals(1, permCheck.solution(makeSequence(SIZE)));
    }

    @Test
    public void testMediumSequence() {
        final int SIZE = 100;
        assertEquals(1, permCheck.solution(makeSequence(SIZE)));
    }

    @Test
    public void testMediumSequence2() {
        final int SIZE = 1000;
        assertEquals(1, permCheck.solution(makeSequence(SIZE)));
    }

    @Test
    public void testMediumSequence3() {
        final int SIZE = 10000;
        assertEquals(1, permCheck.solution(makeSequence(SIZE)));
    }


    @Test
    public void testLargeSequence() {
        final int SIZE = 100000;
        assertEquals(1, permCheck.solution(makeSequence(SIZE)));
    }

    private int[] makeSequence(int size) {
        int A[] = new int[size];
        for (int i = 0; i < size; i++) A[i] = i+1;
        return A;
    }

//    @Test
//    public void testSumOkButNotPermutation() {
//        assertEquals(1, permCheck.solution(new int[]{1, 2, 3, 4, 5}));
//    }
}
