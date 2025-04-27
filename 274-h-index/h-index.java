class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int count = 0;
        Arrays.sort(citations);
        for(int i = 0 ; i  < n ; i++){
             count = n - i;
            if(citations[i]>=count){
                return count;
            }
        }
        return 0;
    }
}