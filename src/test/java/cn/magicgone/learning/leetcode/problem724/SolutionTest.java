package cn.magicgone.learning.leetcode.problem724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    void pivotIndex(int[] nums, int expectedResult) {
        Solution solution = new Solution();
        int pivotIndex = solution.pivotIndex(nums);
        Assertions.assertEquals(expectedResult, pivotIndex);
    }

    static Stream<Arguments> pivotIndex() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3)
        );
    }

}