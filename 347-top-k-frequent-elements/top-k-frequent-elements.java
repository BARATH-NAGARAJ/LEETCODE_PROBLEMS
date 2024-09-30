class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(hash.entrySet());
        int[] took=new int[k];
        for(int i=0;i<k;i++){
            took[i]=maxheap.poll().getKey();
        }
        return took;
    }
}