package cn.magicgone.learning.leetcode.problem5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void test(String str, String expected) {
        Solution solution = new Solution();
        String actual = solution.longestPalindrome(str);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("a", "a"),
                Arguments.of("abba", "abba"),
                Arguments.of("abcbd", "bcb"),
                Arguments.of("abbc", "bb")
        );
    }
}
