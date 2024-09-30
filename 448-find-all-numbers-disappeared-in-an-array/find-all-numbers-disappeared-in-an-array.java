class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}