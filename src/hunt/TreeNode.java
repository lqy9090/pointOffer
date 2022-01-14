package hunt;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right; //默认protected 包可见类型

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return ""+val+"";
    }
}
