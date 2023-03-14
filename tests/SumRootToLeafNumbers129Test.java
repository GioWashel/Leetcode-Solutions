import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbers129Test {

    SumRootToLeafNumbers129.TreeNode tree1 = new SumRootToLeafNumbers129.TreeNode(0);
    SumRootToLeafNumbers129.TreeNode tree2 = new SumRootToLeafNumbers129.TreeNode(2);
    SumRootToLeafNumbers129.TreeNode tree3 = new SumRootToLeafNumbers129.TreeNode(3);
    SumRootToLeafNumbers129.TreeNode tree4 = new SumRootToLeafNumbers129.TreeNode(1, tree2, tree3);
    SumRootToLeafNumbers129.TreeNode leftHeavy = new SumRootToLeafNumbers129.TreeNode(5, tree4, tree2);
    @org.junit.jupiter.api.Test
    @Test
    public void sumNumbers() {
        //test case where tree has no children
        assertEquals(SumRootToLeafNumbers129.sumNumbers(tree1), 0);
        //test case where tree has both children
        assertEquals(SumRootToLeafNumbers129.sumNumbers(tree4), 25);
        //test case where tree is heavy
        assertEquals(SumRootToLeafNumbers129.sumNumbers(leftHeavy), 1077);
    }

}