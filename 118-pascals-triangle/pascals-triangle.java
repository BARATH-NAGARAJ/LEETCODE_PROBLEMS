class Solution {
     public List<List<Integer>> generate(int numRows) {
         ArrayList<List<Integer>> result = new ArrayList<>();
         if(numRows == 0) return result;
        ArrayList<Integer> arr = new ArrayList<>();
         arr.add(1);
         result.add(arr);
         if(numRows == 1){
             return result;
         }
         for(int i = 1; i < numRows; i++){
                List<Integer> pre = result.get(i-1);
                ArrayList<Integer> res = new ArrayList<>();
                res.add(1);
          for(int j = 0; j < i-1 ; j++)
          {
             res.add(pre.get(j)+pre.get(j+1));
          }
             res.add(1);
             result.add(res);
         }
       return result;     
       }
 }

