package cn.magicgone.learning.leetcode.problem392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    public void isSubsequence(String s, String t, boolean expectedResult) {
        Solution solution = new Solution();
        boolean actualResult = solution.isSubsequence(s, t);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isSubsequence() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false)
        );
    }
}