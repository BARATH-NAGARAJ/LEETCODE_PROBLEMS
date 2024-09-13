class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
       // int mid=0;
        while(low<=high){
           int mid=low+(high-low)/2;
            if(target>=letters[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return letters[low%letters.length];
    }
}
