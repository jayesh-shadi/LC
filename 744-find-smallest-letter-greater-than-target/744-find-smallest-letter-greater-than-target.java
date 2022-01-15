class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int a=0;
        int b=letters.length-1;
        while(a<=b)
        {
            int mid=a+(b-a)/2;
        if(letters[mid]==target)
        {
            a=mid+1;
        }
            else if(target>letters[mid])
            {
                a=mid+1;
            }
            else if(target<letters[mid]){
                res=letters[mid];
                b=mid-1;
            }
        
        
        }
        return res;
    }
}