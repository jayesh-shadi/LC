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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode curr=root,par=null;
        while(curr!=null)
        {
            par=curr;
            if(curr.val<val)
            {
                curr=curr.right;
            }
            else{
                curr=curr.left;
            }
        }
        if(val<par.val) par.left=new TreeNode(val);
        else par.right=new TreeNode(val);
        return root;
    }
}