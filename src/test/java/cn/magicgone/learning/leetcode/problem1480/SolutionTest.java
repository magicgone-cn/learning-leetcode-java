package cn.magicgone.learning.leetcode.problem1480;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    public void runningSum(int[] nums, int[] expectedResult) {
        Solution solution = new Solution();
        int[] sums = solution.runningSum(nums);
        Assertions.assertArrayEquals(expectedResult, sums);
    }

    static Stream<Arguments> runningSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 3, 6, 10}),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{3, 1, 2, 10, 1}, new int[]{3, 4, 6, 16, 17})
        );
    }
}