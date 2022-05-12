import java.util.ArrayList;
import java.util.List;

public class T94 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        inorderTraversal(treeNode);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        method(root, list);
        return list;
    }

    public static void method(TreeNode root, List<Integer> list) {
        //左
        if (root.left != null) {
            method(root.left, list);
        }
        //中
        list.add(root.val);
        //右
        if (root.right != null) {
            method(root.right, list);
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}