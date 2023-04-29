package cn.magicgone.learning.leetcode.problem20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource
    public void test(String s, boolean result) {
        assertEquals(result, solution.isValid(s));
    }

    static Stream<Arguments> test() {
        return Stream.of(Arguments.of("()", true));
    }
}
