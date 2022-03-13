/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res;
    public int maxPathSum(TreeNode root) {
        res=root.val;
        max(root);
        return res;
    }
    public int max(TreeNode x)
    {
        if(x==null) return 0;
        int left=max(x.left);
        int right=max(x.right);
        res=Math.max(res,x.val+left+right);
        return Math.max(0,x.val+Math.max(left,right));
    }
}