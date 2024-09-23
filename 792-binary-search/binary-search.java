class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int rigth=nums.length-1;
        int mid=0;
        while(left<=rigth){
            mid=left+(rigth-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                rigth=mid-1;
            }
        }
        return -1;
    }
}