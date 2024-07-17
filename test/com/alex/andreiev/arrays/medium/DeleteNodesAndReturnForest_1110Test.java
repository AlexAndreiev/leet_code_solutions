package com.alex.andreiev.arrays.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodesAndReturnForest_1110Test {

    @Test
    void delNodes() {
        var target = new DeleteNodesAndReturnForest_1110();

        var input = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, new TreeNode(6), new TreeNode(7))
        );

        var expected = List.of(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                null),
            new TreeNode(6),
            new TreeNode(7)
        );
        var actual = target.delNodes(input, new int[]{3, 5});
        checkLists(expected, actual);


        input = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(3)),
            new TreeNode(4)
        );
        expected = List.of(new TreeNode(1, new TreeNode(2), new TreeNode(4)));
        actual = target.delNodes(input, new int[]{3});
        checkLists(expected, actual);

        input = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(3)),
            null
        );
        expected = List.of(new TreeNode(1), new TreeNode(4));
        actual = target.delNodes(input, new int[]{2, 3});
        checkLists(expected, actual);
    }

    void checkLists(List<TreeNode> expected, List<TreeNode> actual) {
        assertEquals(expected.size(), actual.size());
        for (var l : actual) {
            assertTrue(expected.stream().anyMatch(l::equals));
        }
    }
}