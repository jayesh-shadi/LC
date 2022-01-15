class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         if(target>=letters[letters.length-1]){
            return letters[0];
        }
         int start=0, middle=0, end=letters.length-1;
        
        while(start<=end){
            middle=start+(end-start)/2;
            if(target==letters[middle] || target>letters[middle]){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }
        
        return letters[start];
    }
}