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

    public static void main(String[] args) {
	    int A[] = {1, 3, 6, 4, 1, 2};
        int solution = new MissingInteger().solution(A);
        System.out.println("Solution is " + solution);

        A = new int[]{1, 3, 6, 4, 1, 2, 5, 10, 9, 7};
        solution = new MissingInteger().solution(A);
        System.out.println("Solution is " + solution);

        A = new int[]{-1, 3, 6, 4, 1, 2, 5, 10, 9, 7};
        solution = new MissingInteger().solution(A);
        System.out.println("Solution is " + solution);

        A = new int[]{4, 5, 6, 2};
        solution = new MissingInteger().solution(A);
        System.out.println("Solution is " + solution);

        A = new int[]{1};
        solution = new MissingInteger().solution(A);
        System.out.println("Solution is " + solution);
    }

    public int solution(int[] A) {
        int max = 0;
        Set<Integer> presence = new HashSet<>();
        for (int elem : A) {
            if (elem > 0) {
                presence.add(elem);
                if (max < elem) max = elem;
            }
        }

        for (int i = 1; i < max; i++) {
            if (!presence.contains(i)) {
                return i;
            }
        }
        return 0;
    }

}
