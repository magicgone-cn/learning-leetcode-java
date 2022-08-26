package cn.magicgone.learning.leetcode.problem21;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {

    @ParameterizedTest
    @MethodSource
    void mergeTwoLists(ListNode list1, ListNode list2, ListNode expectedResult) {
        List<Solution> solutions = Arrays.asList(new RecursionSolution(), new SimpleRecursionSolution());
        for (Solution solution : solutions) {
            ListNode l1 = list1 == null ? null : list1.clone();
            ListNode l2 = list2 == null ? null : list2.clone();
            ListNode mergedListNode = solution.mergeTwoLists(l1, l2);
            Assertions.assertEquals(expectedResult, mergedListNode);
        }
    }

    static Stream<Arguments> mergeTwoLists() {
        return Stream.of(
                Arguments.of(build("[1,2,4]"), build("[1,3,4]"), build("[1,1,2,3,4,4]")),
                Arguments.of(build("[]"), build("[]"), build("[]"))
        );
    }

    static ListNode build(String jsonStr) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> list = null;
        try {
            list = objectMapper.readValue(jsonStr, new TypeReference<List<Integer>>() {
            });
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        if (list.isEmpty()) {
            return null;
        }
        ListNode listNode = new ListNode(list.get(0));
        ListNode tailNode = listNode;
        for (int i = 1; i < list.size(); i++) {
            tailNode.next = new ListNode(list.get(i));
            tailNode = tailNode.next;
        }
        return listNode;
    }
}