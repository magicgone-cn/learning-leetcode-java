package cn.magicgone.learning.leetcode.problem15;

import cn.magicgone.utils.json.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {

    private Solution solution = new Solution();

    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(JsonUtil.read("[-1, 0, 1, 2, -1, -4]", int[].class), JsonUtil.read("[[-1,-1,2],[-1,0,1]]", new TypeReference<List<List<Integer>>>() {
                }))
        );
    }

    @ParameterizedTest
    @MethodSource
    public void test(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.threeSum(nums);
    }


}
