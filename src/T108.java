public class T108 {
    public static void main(String[] args) {
        int[] ints = {-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(ints));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return tree(0, nums.length - 1, nums);
    }

    public static TreeNode tree(int low, int high, int[] num) {
        if (low>high){return null;}
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = tree(low, mid - 1, num);
        root.right = tree(mid + 1, high, num);
        return root;
    }
}
