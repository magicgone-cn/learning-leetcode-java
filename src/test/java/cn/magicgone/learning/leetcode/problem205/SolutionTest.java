package cn.magicgone.learning.leetcode.problem205;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void isIsomorphic(String s, String t, boolean expectedResult) {
        Solution solution = new Solution();
        boolean actualResult = solution.isIsomorphic(s, t);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    static Stream<Arguments> isIsomorphic() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("badc", "baba", false)
        );
    }
}