import java.util.ArrayList;
import java.util.List;

public class T144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(4,null,null), new TreeNode(2, new TreeNode(3, null, null), null));
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null){return list;}
        method(root, list);
        return list;
    }

    public static void method(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            method(root.left, list);
        }
        if (root.right != null) {
            method(root.right, list);
        }
    }
}
