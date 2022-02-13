//In the first loop items are being swapped diagonally, and horizontally in the second for loop. 
/*For example, if the matrix is:

1 2 3

4 5 6

7 8 9

then after the first for loop, it becomes:

1 4 7

2 5 8

3 6 9

then after the second for loop, it becomes:

7 4 1

8 5 2

9 6 3
*/
class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length <= 1) {
        return;
    }
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int head=0;
            int tail=matrix.length-1;
            while(head<tail)
            {
                  int temp = matrix[i][head];
            matrix[i][head] = matrix[i][tail];
            matrix[i][tail] = temp;
            head++;
            tail--;
            }
        }
        
    }
}