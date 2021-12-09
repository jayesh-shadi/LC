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
    private int maxlevel=0,sum=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;
        Calculatesum(root,0);
        return sum;
    }
    
    private void Calculatesum(TreeNode root,int level)
    {
        if(root==null) return ;
        if(level>maxlevel){
            sum=0;
            maxlevel=level;
        }
        if(level==maxlevel)
        {
            sum+=root.val;
        }
        Calculatesum(root.left,level+1);
        Calculatesum(root.right,level+1);
    }
}