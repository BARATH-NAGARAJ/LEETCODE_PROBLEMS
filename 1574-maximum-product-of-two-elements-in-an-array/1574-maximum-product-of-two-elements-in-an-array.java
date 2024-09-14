class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last=nums.length-1;
        int lastbef=nums.length-2;
        int sum=1;
        for(int i=lastbef;i<=last;i++){
           sum*=nums[i]-1;
        }
        return sum;
    }
}