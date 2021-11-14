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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
       postorder(root,ans);
        return ans;
        
    }
    
    public void postorder(TreeNode root,List<Integer> ans)
    {
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
}