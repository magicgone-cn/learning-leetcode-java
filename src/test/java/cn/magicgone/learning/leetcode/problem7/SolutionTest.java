package cn.magicgone.learning.leetcode.problem7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void test(int x, int expected) {
        Solution solution = new Solution();
        int actual = solution.reverse(x);
        Assertions.assertEquals(expected,actual);
    }

    static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1234567890, 987654321),
                Arguments.of(-1234567890, -987654321),
                Arguments.of(1234567899,0)
        );
    }

}
