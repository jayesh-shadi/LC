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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null) return null;
        TreeNode head=helper(nums,0,nums.length-1);
        return head;
    }
    public TreeNode helper(int[] num,int low,int high)
    {
            if (low > high) { // Done
        return null;
    }
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(num[mid]);
        root.left=helper(num,low,mid-1);
        root.right=helper(num,mid+1,high);
        return root;
    }
}