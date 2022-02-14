class Solution
{
    HashMap<Integer, Integer> map= new HashMap<>();//sum of node --- frequency
    public int[] findFrequentTreeSum(TreeNode root) 
    {
        helper(root);//helping us to calculate the sum of node and their corresponding frequency 
        
        int maxFreq= Integer.MIN_VALUE;//identity of maximum 
        
        for(int i : map.values())//getting the maximum frequency in the Hash Map 
            maxFreq= Math.max(maxFreq, i);
        
        List<Integer> res= new ArrayList<>();//to the element having the maximum frequency 
         
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() == maxFreq)//finding the element with the maximum frequency(found previously) 
                res.add(entry.getKey());//and adding them to the ArrayList
        } 
        
        int[] ans = new int[res.size()];//on the basis of ArrayList size, defining a Array 
        
        for (int i= 0; i < ans.length; i++) 
			ans[i]= res.get(i);//putting the elements from ArrayList to the array 
            
        return ans;//returning the resultant array
    }
    public int helper(TreeNode root)
    {//postorder traversal is used because we want to know the child information first and then the parent (Left Right Root)//Bottom Up approach 
        
        if(root == null)//Base case when we reach the null node, we return 0 because we dont want to affect the sum of leaf node 
            return 0;//returning 0 to the parent, then parent calculate the sum on the basis of value received from the child 
        
        int left= helper(root.left);//recursing down the left subtree
        int right= helper(root.right);//recursing down the right subtree 
        
        int currSum= left + right + root.val;//parent is calulating the sum on the basis of sum value received from its left and right child 
        
        map.put(currSum, map.getOrDefault(currSum, 0)+ 1);//putting the sum and their corresponding frequency into the HashMap 
        
        return currSum;//returning the sum of each node because we want to help the parent in calculating their sum properly 
    }}