package com.josenaves.algorithms;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    //
    //    MissingInteger
    //      https://codility.com/programmers/task/missing_integer
    //
    //    Write a function:
    //
    //    class Solution { public int solution(int[] A); }
    //
    //    that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
    //
    //    For example, given:
    //
    //    A[0] = 1
    //    A[1] = 3
    //    A[2] = 6
    //    A[3] = 4
    //    A[4] = 1
    //    A[5] = 2
    //
    //    the function should return 5.
    //
    //    Assume that:
    //
    //    - N is an integer within the range [1..100,000];
    //    - each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
    //
    //    Complexity:
    //
    //    - expected worst-case time complexity is O(N);
    //    - expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
    //
    //    Elements of input arrays can be modified.
    //

    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> presence = new HashSet<>();
        for (int elem : A) {
            if (elem > 0) {
                presence.add(elem);
                if (min > elem) min = elem;
                if (max < elem) max = elem;
            }
        }

        System.out.println(String.format("min [%d] max [%d] presence.size [%d]", min, max, presence.size()));
        int number = -1;

        if (presence.isEmpty()) {
            // case 1 - all negative numbers or zero (presence is empty)
            number = 1;
        }
        else if (presence.size() == 1) {
            // case 2 - just one element in presence set (positive)
            int elem = presence.iterator().next();
            number = elem == 1 ? 2 : 1;
        }
        else {
            // case 3 - 2 or more elements in presence set (all positive)
            for (int i = 1; i <= max; i++) {
                if (!presence.contains(i)) {
                    number = i;
                    break;
                }
                number = max + 1;
            }
        }

        return number;
    }

}
