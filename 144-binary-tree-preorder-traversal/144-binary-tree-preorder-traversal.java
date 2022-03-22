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
    List<Integer> list1=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
         if(root==null){  //corner case if root is null , we will return empty list
        return list1;
    }
        else{
            Stack<TreeNode> stack=new Stack<>();
            stack.push(root);
            while(stack.size()!=0)
            {
                TreeNode curr=stack.pop();
                  list1.add(curr.val);  
                if(curr.right!=null)
                {
                    stack.push(curr.right);
                }
                if(curr.left!=null)
                {
                    stack.push(curr.left);
                    
                }
                
            }
            return list1;
        }
    }
}