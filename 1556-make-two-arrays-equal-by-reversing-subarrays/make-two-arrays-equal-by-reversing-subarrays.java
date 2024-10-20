class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int count=0;
        for(int i=0;i<target.length;i++){
            if(target[i]==arr[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}