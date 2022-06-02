class Solution {
    public int[][] transpose(int[][] matrix) {
        int M=matrix.length,N=matrix[0].length;
        int [][] transpose=new int[N][M];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
}