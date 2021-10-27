class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s=new Stack<>();
        int k=0;
        for(int item: pushed)
        {
            s.push(item);
            while(!s.empty() && s.peek()==popped[k])
            {
                s.pop();
                k++;
            }
        }
        return s.isEmpty();
    }
}