class Solution {
    public int maximumCount(int[] nums) {
        int zero=0;
        int neg=0;
        int pos=0;
        for(int i:nums)
        {
            if(i<0)neg++;
            else if(i==0)zero++;
            else break;
        }
        return Math.max(neg,nums.length-zero-neg);
    }
}
