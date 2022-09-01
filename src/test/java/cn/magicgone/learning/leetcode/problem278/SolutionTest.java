package cn.magicgone.learning.leetcode.problem278;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void firstBadVersion(int n, int expectedResult) throws NoSuchFieldException, IllegalAccessException {
        Solution solution = new Solution();
        Field field = Solution.class.getSuperclass().getDeclaredField("firstBadVersion");
        field.setAccessible(true);
        field.set(solution, expectedResult);
        int firstBadVersion = solution.firstBadVersion(n);
        Assertions.assertEquals(expectedResult, firstBadVersion);
    }

    static Stream<Arguments> firstBadVersion() {
        return Stream.of(Arguments.of(2126753390, 1702766719));
    }
}