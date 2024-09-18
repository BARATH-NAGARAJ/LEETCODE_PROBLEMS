class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        } 
        int index=0;
        for(int i=0;i<=2;i++){
            int co=map.getOrDefault(i,0);
            for(int j=0;j<co;j++){
                nums[index++]=i;
            }
        }
    }
}