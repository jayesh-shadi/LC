class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stacksoln(s).equals(stacksoln(t));
    }
    public String stacksoln(String str)
    {
        Stack<Character> s=new Stack<>();
        for(char c:str.toCharArray())
        {
            if(c!='#')
            {
                s.push(c);
            }
            else if(!s.isEmpty())
            {
                s.pop();
            }
        }
    return s.toString();
    }
}