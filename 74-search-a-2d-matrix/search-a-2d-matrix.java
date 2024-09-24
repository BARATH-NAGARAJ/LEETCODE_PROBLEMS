class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=matrix.length;
       int colm=matrix[0].length;
       if(row==0)return false;
       int left=0;
       int right=row*colm-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        int midValue = matrix[mid / colm][mid % colm];
        if(midValue==target){
            return true;
        }
        else if(midValue<=target){
            left=mid+1;
        }
        else {
            right=mid-1;
        }
       }
       return false;
    }
}