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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        if(root==null ) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        double level_sum=0;
        while(!queue.isEmpty())
        {
            level_sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currnode=queue.poll();
                level_sum+=currnode.val;
                if(currnode.left!=null) queue.offer(currnode.left);
                if(currnode.right!=null) queue.offer(currnode.right);
                
            }
            double level_avg=level_sum/size;
            result.add(level_avg);
        }
        return result;
    }
}