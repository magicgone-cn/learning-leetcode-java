package cn.magicgone.learning.leetcode.problem392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    public void isSubsequence(Solution[] solutions, String s, String t, boolean expectedResult) {
        for (Solution solution : solutions) {
            boolean actualResult = solution.isSubsequence(s, t);
            Assertions.assertEquals(expectedResult, actualResult);
        }
    }

    static Stream<Arguments> isSubsequence() {
        Solution[] solutions = new Solution[]{new Solution1(), new Solution2()};
        return Stream.of(
                Arguments.of(solutions, "abc", "ahbgdc", true),
                Arguments.of(solutions, "axc", "ahbgdc", false)
        );
    }
}