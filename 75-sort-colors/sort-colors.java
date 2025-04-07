class Solution {
    public void sortColors(int[] nums) {
      int row1 = 0;
      int row2 = 0;
      int row3 = 0;
      for(int i = 0 ; i < nums.length ; i++){
        if(nums[i] == 0){
            row1++;
        }
        else if(nums[i] == 1){
            row2++;
        }
        else{
            row3++;
        }
      }
      for(int i = 0 ; i < nums.length ; i++){
        if(row1 > 0){
            nums[i] = 0;
            row1--;
        }
        else 
        if(row2 > 0){
            nums[i] = 1;
            row2--;
        }
        else{
            nums[i] = 2;
            row3--;
        }
      }
    }
}