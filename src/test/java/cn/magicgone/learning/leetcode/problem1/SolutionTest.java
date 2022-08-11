package cn.magicgone.learning.leetcode.problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    public void twoSum(int[] nums, int target, int[] expectedResult) {
        int[] actualResult = new Solution().twoSum(nums, target);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> twoSum() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2})
        );
    }
}