
class Solution {
    boolean isBalance = true;

    public boolean isBalanced(TreeNode root) {
        helper(root);
        return isBalance;
    }

    int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = helper(root.left);
        int rh = helper(root.right);

        if (Math.abs(lh - rh) > 1) {
            isBalance = false;
        }

        return Math.max(lh, rh) + 1;
    }
}
