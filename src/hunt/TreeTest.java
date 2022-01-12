package hunt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeTest {
//    public TreeNode generateTree(int[] elements) {
//        TreeNode root = new TreeNode(elements[0]);
//        for(int i = 0 )
//        return null;
//    }
    static void levelOrderTest() {
        TreeNode root = new TreeNode(3);TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        root.left = node2; root.right = node3;
        node2.left = null; node2.right = null;
        node3.left = node4; node3.right = node5;
        node4.left = null; node4.right = null;
        node5.left = null; node5.right = null;

        TreeSolution treeSolution = new TreeSolution();
//        int[] order = treeSolution.levelOrder(root);
        int[] ans = treeSolution.levelOrderGF(root);
        System.out.println(Arrays.toString(ans));
    }

    {
        TreeNode root = new TreeNode(1);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2; root.right = node3;
        node2.left = node4; node2.right = null;
        node3.left = null; node3.right = node5;
        node4.left = null; node4.right = null;
        node5.left = null; node5.right = null;
    }

    {
        TreeNode root = new TreeNode(1);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2; root.right = null;
        node2.left = node3; node2.right = null;
        node3.left = node4; node3.right = null;
        node4.left = node5; node4.right = null;
        node5.left = null; node5.right = null;
    }

    static void levelOrder2Test() {
        TreeNode root = new TreeNode(1);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2; root.right = null;
        node2.left = node3; node2.right = null;
        node3.left = node4; node3.right = null;
        node4.left = node5; node4.right = null;
        node5.left = null; node5.right = null;

        TreeSolution treeSolution = new TreeSolution();
//        int[] order = treeSolution.levelOrder(root);
        List<List<Integer>> ans = treeSolution.levelOrder2(root);
        System.out.println(ans);
    }

    static void levelOrder3Test() {
        TreeNode root = new TreeNode(3);TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        root.left = node2; root.right = node3;
        node2.left = null; node2.right = null;
        node3.left = node4; node3.right = node5;
        node4.left = null; node4.right = null;
        node5.left = null; node5.right = null;

        TreeSolution treeSolution = new TreeSolution();
//        int[] order = treeSolution.levelOrder(root);

        List<List<Integer>> ans = treeSolution.levelOrder3203(root);
        System.out.println(ans);
    }

    {
        TreeNode A = new TreeNode(1);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        A.left = node2; A.right = node3;
        node2.left = null; node2.right = null;
        node3.left = null; node3.right = null;

        TreeNode B = new TreeNode(3); TreeNode nodeB2 = new TreeNode(1);
        B.left = nodeB2; B.right = null;
    }

    {
        TreeNode A = new TreeNode(3);TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5); TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        A.left = node2; A.right = node3;
        node2.left = node4; node2.right = node5;
        node3.left = null; node3.right = null;

        TreeNode B = new TreeNode(4); TreeNode nodeB2 = new TreeNode(1);
        B.left = nodeB2; B.right = null;
    }


    static void isSubStructureTest() {
        TreeNode A = new TreeNode(4);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3); TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5); TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7); TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        A.left = node2; A.right = node3;
        node2.left = node4; node2.right = node5;
        node3.left = node6; node3.right = node7;
        node4.left = node8; node4.right = node9;
        node5.left = null; node5.right = null;
        node6.left = null; node6.right = null;
        node7.left = null; node7.right = null;

        TreeNode B = new TreeNode(4); TreeNode nodeB2 = new TreeNode(8); TreeNode nodeB3 = new TreeNode(9);
        B.left = nodeB2; B.right = nodeB3;
        nodeB2.left = null; nodeB2.right = null;
        nodeB3.left = null; nodeB3.right = null;

        TreeSolution treeSolution = new TreeSolution();
//        boolean subStructure = treeSolution.isSubStructureV1(A, B);
        boolean subStructure = treeSolution.isSubStructureV2(A, B);

        System.out.println(subStructure);

    }

    public void mirrorTreeTest() {
        TreeNode A = new TreeNode(4);TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7); TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3); TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);
        A.left = node2; A.right = node3;
        node2.left = node4; node2.right = node5;
        node3.left = node6; node3.right = node7;
        node4.left = null; node4.right = null;
        node5.left = null; node5.right = null;
        node6.left = null; node6.right = null;
        node7.left = null; node7.right = null;

        TreeSolution treeSolution = new TreeSolution();
        TreeNode node = treeSolution.mirrorTree(A);
        printTree(node);
//        int[] ans = treeSolution.levelOrderGF(node);
//        System.out.println(Arrays.toString(ans));
    }

    public void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println("root: "+root.val+" left: " + root.left.val + " right: " + root.right.val);
        printTree(root.left);
        printTree(root.right);
    }



    public static void main(String[] args) {
        TreeTest treeTest = new TreeTest();
//        levelOrderTest();
//        levelOrder2Test();
//        levelOrder3Test();
//        isSubStructureTest();
        treeTest.mirrorTreeTest();
    }
}
