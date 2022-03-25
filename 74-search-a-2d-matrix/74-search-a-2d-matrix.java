class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
  
   int i = 0;
    int j = matrix[0].length - 1; //Top right corner
    boolean flag = false;
    
    // if element > i, i will increase and if element is smaller than j, j will decrease
    while(i < matrix.length && j >= 0){
        if(target == matrix[i][j]){
            flag = true;
            break;
        }
        else if(target < matrix[i][j]){
            j--;
        }
        else{
            i++;
        }
    }
    
    return flag;
    
    }
}