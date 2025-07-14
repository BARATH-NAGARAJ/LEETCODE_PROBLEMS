class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2;i++){
            int left = i+1;
            int rigth = nums.length-1;
            while(left < rigth) {
                int sum = nums[i] + nums[left] + nums[rigth];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[rigth]));
                    rigth--;
                    left++;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    rigth--;
                }
            }
        }
        return new ArrayList<>(result);

    }
}