class Solution {
    public int pivotIndex(int[] nums) {
        int lefttotal=0;
        int rigthtotal=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        
        for(int i=0;i<nums.length;i++){
            int pivot=nums[i];
            rigthtotal=sum-lefttotal-pivot;
            if(rigthtotal==lefttotal){
                return i;
            }
            lefttotal+=nums[i];
        }
        return -1;

    }
}