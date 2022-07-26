/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          // if none of the trees contains p and q
        if (root == null) return null;
        
        // if we find p or q, we return it
        if (root == p || root == q) return root;
        
        TreeNode lca1 = lowestCommonAncestor(root.left, p, q);
        TreeNode lca2 = lowestCommonAncestor(root.right, p, q);
        
        // if one of the subtrees contain p and other contains q
        if (lca1 != null && lca2 != null) return root;
        
        // if one of the subtree contains both p and q
        if (lca1 != null) return lca1; else return lca2;
    }
}