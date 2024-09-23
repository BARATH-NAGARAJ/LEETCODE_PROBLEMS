class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long val=num;
        if(num<0){
            val=(long)(Math.pow(2,32)+num);
        }
        StringBuilder s=new StringBuilder();
        while(val!=0){
            int remainder = (int)(val%16);
            val=val/16;
            if(remainder>=10){
                s.append((char)(remainder-10+'a'));
            }
            else {
                s.append(remainder);
            }
        }
        return s.reverse().toString();
    }
}