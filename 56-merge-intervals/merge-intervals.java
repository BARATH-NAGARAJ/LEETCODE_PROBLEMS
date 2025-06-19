class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        List<int[]> merge = new ArrayList<>();
        int current[] = intervals[0];
        // int next[];
        for(int i = 1 ; i < intervals.length; i++){
           int next[] = intervals[i];
            if(current[1] >= next[0]){
                current[1] = Math.max(next[1],current[1]);
            }
            else{
                merge.add(current);
                current = next;
            }
        }
        merge.add(current);
        
    return merge.toArray(new int[merge.size()][]);
    }
}