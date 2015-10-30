package com.josenaves.algorithms;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    //
    //    PermCheck: Check whether array A is a permutation.
    //
    //    A non-empty zero-indexed array A consisting of N integers is given.
    //
    //    A permutation is a sequence containing each element from 1 to N once, and only once.
    //
    //    For example, array A such that:
    //
    //    A[0] = 4
    //    A[1] = 1
    //    A[2] = 3
    //    A[3] = 2
    //    is a permutation, but array A such that:
    //
    //    A[0] = 4
    //    A[1] = 1
    //    A[2] = 3
    //    is not a permutation, because value 2 is missing.
    //
    //    The goal is to check whether array A is a permutation.
    //
    //    Write a function:
    //
    //    class Solution { public int solution(int[] A); }
    //
    //    that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
    //
    //    For example, given array A such that:
    //
    //    A[0] = 4
    //    A[1] = 1
    //    A[2] = 3
    //    A[3] = 2
    //    the function should return 1.
    //
    //    Given array A such that:
    //
    //    A[0] = 4
    //    A[1] = 1
    //    A[2] = 3
    //    the function should return 0.
    //
    //    Assume that:
    //
    //    N is an integer within the range [1..100,000];
    //    each element of array A is an integer within the range [1..1,000,000,000].
    //
    //    Complexity:
    //
    //    expected worst-case time complexity is O(N);
    //    expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
    //    Elements of input arrays can be modified.


    public int solution(int[] A) {
        int size = A.length;
        Set<Integer> presence = new HashSet<>();

        BigInteger sum = sum(size);

        BigInteger actualSum = BigInteger.ZERO;

        for (int i = 0; i < size; i++) {
            int elem = A[i];
            actualSum = actualSum.add(BigInteger.valueOf((long)elem));

            if (presence.contains(elem)) return 0;

            presence.add(elem);
        }

        return sum.equals(actualSum )? 1 : 0;

        // Errors:
        // - sum is correct but it is not a permutation
        // - large permutation but one element occurs 3 times
        // - large sequence 1..N
    }

    private BigInteger sum(long size) {
        BigInteger bigSize = BigInteger.valueOf(size);
        BigInteger two = BigInteger.valueOf(2l);

        BigInteger addition = BigInteger.ONE.add(bigSize);
        BigInteger multiplication = addition.multiply(bigSize);
        BigInteger division = multiplication.divide(two);

        return division;
    }

}
