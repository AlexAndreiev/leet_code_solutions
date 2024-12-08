package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideView_199Test {

    @Test
    void rightSideView() {
        var target = new BinaryTreeRightSideView_199();

        var root = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(5)),
            new TreeNode(3, null, new TreeNode(4))
        );

        var result = target.rightSideView(root);
        assertIterableEquals(List.of(1, 3, 4), result);

        root = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(4, null, new TreeNode(5))),
            new TreeNode(3)
            );
        result = target.rightSideView(root);
        assertIterableEquals(List.of(1, 3, 4, 5), result);

        root = new TreeNode(1, null, new TreeNode(3));
        result = target.rightSideView(root);
        assertIterableEquals(List.of(1, 3), result);

        root = null;
        result = target.rightSideView(root);
        assertIterableEquals(List.of(), result);
    }
}