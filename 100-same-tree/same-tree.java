class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both nodes are null
        if (p == null && q == null) return true;

        // One of the nodes is null or values don't match
        if (p == null || q == null || p.val != q.val) return false;

        // Recursively compare left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
