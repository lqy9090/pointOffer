package hunt;

import hunt.TreeNode;

import java.util.*;

public class TreeSolution {

    public int[] levelOrder(TreeNode root) {
        System.out.println(root.val);
        List<Integer> list = defPrint(root);
        System.out.println(Arrays.toString(list.toArray()));
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public List<Integer> defPrint(TreeNode root) {
        System.out.println(root.val + " left: " + root.left + " right: " + root.right);
        ArrayList<Integer> res = new ArrayList<>();
        while (root.right != null) {
            res.add(root.val);
            defPrint(root.right);
        }
        while (root.left !=null){
            res.add(root.val);
            defPrint(root.left);
        }

        return res;
    }

    public int[] levelOrderGF(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>() {{ add(root); }}; //匿名内部类
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    //双队列控制层次
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>() {{ add(root); }}; //匿名内部类
        List<List<Integer>> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
//            System.out.println("node size: "+queue.size());
//            Integer n = queue.size();
//            for (int i = 0; i < n; i++) {
            for (int i = queue.size(); i>0; i--){ //*****点睛之笔
                TreeNode node = queue.poll();
//                System.out.println("sub node: "+node.val);
                temp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(temp);
        }
        return ans;
    }

    public List<List<Integer>> levelOrder3203(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>() {{ add(root); }}; //匿名内部类
        List<List<Integer>> ans = new ArrayList<>();

        int height = 1;
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            Queue<Integer> queueTmp = new LinkedList<>();
            Stack<Integer> stackTmp = new Stack<>();
            for (int i = queue.size(); i>0; i--){ //*****点睛之笔
                TreeNode node = queue.poll();
//                System.out.println("sub node: "+node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (height%2 == 0) stackTmp.add(node.val);
                else queueTmp.add(node.val);
            }
            if (height%2 == 0) {
                while (!stackTmp.isEmpty()){
                    Integer val = stackTmp.pop();
                    temp.add(val);
                }
            }else {
                while (!queueTmp.isEmpty()){
                    Integer val = queueTmp.poll();
                    temp.add(val);
                }
            }
            ans.add(temp);
            height++;
        }
        return ans;
    }

    public boolean isSubStructureV1(TreeNode A, TreeNode B) {
        if (B == null) return false;
        //打印B树结构
        ArrayList<Integer> bList = levelOrderSub(B);
        Queue<TreeNode> queueA = new LinkedList<>() {{add(A);}};
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        while (!queueA.isEmpty()) {
            TreeNode node = queueA.poll();
            if (node.val == B.val) {
//                ans.add(node.val);
                ArrayList<Integer> ansTemp = levelOrderSub(node);
                ansList.add(ansTemp);
            }
            if (node.left != null) queueA.add(node.left);
            if (node.right != null) queueA.add(node.right);
        }
//        System.out.println(ansList.toString());
//        System.out.println(bList.toString());
//        if(ansList.size() < bList.size()) return false;
        for (ArrayList<Integer> ans : ansList) {
            List<Integer> subList = ans.subList(0, Math.min(ans.size(), bList.size()));
//            System.out.println(subList.toString());
            if (bList.equals(subList)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> levelOrderSub(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>() {{ add(root); }}; //匿名内部类
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
//        int[] res = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            res[i] = ans.get(i);
//        }
        return ans;
    }

    public boolean isSubStructureV2(TreeNode A, TreeNode B) {
        if (B == null) return false; //空树不是子树
        ArrayList<Integer> bList = levelOrderSub(B);
        System.out.println(bList.toString());

        Queue<TreeNode> queue = new LinkedList<>(){{add(A);}};
        List<Integer> ansList = new ArrayList<>();
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print("val: "+node.val+" B.val:"+B.val+" i:"+i+" ansList: ");
//            System.out.println(ansList.toString());
            if (node.val == B.val){
                ansList.add(node.val);
            }
            System.out.println(ansList.toString());
            if (ansList.size() > 0){
                if (node.val == bList.get(i)){
                    ansList.add(node.val);
                    i++;
                }else {
                    ansList.clear();
                    i = 1;
                }
            }
            if (ansList.equals(bList)) {
                return true;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        return false;
    }

    public boolean isSubStructureGF(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructureGF(A.left, B) || isSubStructureGF(A.right, B));
    }
    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    public TreeNode mirrorTree(TreeNode root) { //击败百分百 嘿嘿
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>(){{ add(root);}};
        List<List<TreeNode>> ans = new ArrayList<>();
//        Queue<TreeNode> ans = new LinkedList<>();
        while (!queue.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            for (int i = queue.size(); i>0; i--){
                TreeNode node = queue.poll();
//                TreeNode mirrorNode = new TreeNode(node.val);
//                ans.add(mirrorNode);
                temp.add(node==null?null:new TreeNode(node.val));
                if (node != null){
                    queue.add(node.right);
//                if (node.left != null)
                    queue.add(node.left);
                }

            }
            ans.add(temp);
        }
        System.out.println(ans.toString());

        TreeNode mirrorRoot = ans.get(0).get(0);
//        TreeNode mirrorRoot =  ans.poll();
//        recurBind(mirrorRoot, ans);
        for (int i = 0; i < ans.size(); i++) {
            List<TreeNode> nodeList = ans.get(i);
//            System.out.println(nodeList.size());
            int j = 0;
            for (TreeNode node : nodeList) {
                if(node == null) continue;
                System.out.print("node.val: "+node.val+" i: "+i+" j: "+ j);
                node.left = (i == ans.size() -1) ? null: ans.get(i + 1).get(j);
                System.out.println(" j: "+ j);
                node.right = (i == ans.size() -1) ? null: ans.get(i + 1).get(++j);
                j++;
            }
        }

        return mirrorRoot;
    }

    public TreeNode mirrorTreeV2(TreeNode root) { //交换会将整棵子树交换
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>() {{ add(root); }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.right != null) queue.add(node.right);
            if (node.left != null) queue.add(node.left);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }

    public TreeNode mirrorTreeV3(TreeNode root) { //递归法
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTreeV3(root.right);
        root.right = mirrorTreeV3(tmp);
        return root;
    }

    public TreeNode isSymmetricV2(Boolean flag, TreeNode root) { //递归法
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = isSymmetricV2(flag, root.right);
        root.right = isSymmetricV2(flag, tmp);
        if (root.left != root.right) flag = false;
        return root;
    }

    public boolean isSymmetric(TreeNode root) {
        //打印本树
        ArrayList<Integer> own = levelOrderSub(root);
        System.out.println(own.toString());
        //获取镜像
        TreeNode mirrorNode = mirrorTreeV3(root);
        //打印镜像
        ArrayList<Integer> mirror = levelOrderSub(mirrorNode);
        System.out.println(mirror.toString());
        //比较两个打印列表
        return mirror.equals(own);
    }

}
