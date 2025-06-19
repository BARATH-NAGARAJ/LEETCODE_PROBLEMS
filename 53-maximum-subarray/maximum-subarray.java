class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum < 0){
                sum = 0;
            }
            sum = sum+nums[i];
            c = Math.max(c,sum); 
        }
        return c;
    }
}