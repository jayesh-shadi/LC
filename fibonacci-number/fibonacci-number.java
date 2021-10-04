class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        else
        return fib(n-1)+fib(n-2);
    }
}
//Time complexity=o(n)
//Space complexity=o(1)


/*Solution 2   

(Iterative)

class Solution 
{
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        
		int a = 0, b = 1;
		
		while(N-- > 1)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
        return b;
    }
}
*/