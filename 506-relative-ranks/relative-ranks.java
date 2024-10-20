class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer=new String[score.length];
        int[] arrcopy=score.clone();
        Arrays.sort(arrcopy);
        int n=score.length;
        for(int i=n-1;i>=0;i--){
            int ans = n - BinarySearch(arrcopy, score[i]); 
            if(ans==1){
                answer[i]="Gold Medal";
            }
            else if(ans==2){
                answer[i]="Silver Medal";
            }
            else if(ans==3){
                answer[i]="Bronze Medal";
            }
            else{
                answer[i] = String.valueOf(ans);
            }

        }
        return answer;
    }
        public static int BinarySearch(int[] score,int target){
            int low=0;
            int high=score.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(score[mid]==target){
                    return mid;
                }
                else if(score[mid]<target){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            return -1;
        }

        }
    