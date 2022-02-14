class Solution {
public TreeNode bstFromPreorder(int[] preorder) {
return bstUtil(preorder,0,preorder.length-1);
}
TreeNode bstUtil(int[] pre,int start,int end){
if(start > end)
return null;

    TreeNode node = new TreeNode(pre[start]);
    int i;
	// By this loop we find the index till where the left subtree is depcited in the preorder array.
    for(i=start+1;i<=end;i++){
        if(pre[i] > node.val)
            break;
    }
    // All the lower values to root value will be from start to i-1;
    node.left = bstUtil(pre,start+1,i-1);
	   // All the bigger values to root value will be from i to end
    node.right = bstUtil(pre,i,end);
    return node;
}}