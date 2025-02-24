class Solution {
    public int countSeniors(String[] details) {
        int i,count=0;
        for(i=0;i<details.length;i++){
           int a=details[i].charAt(11)-'0';
           int b=details[i].charAt(12)-'0';
           int c=(a*10)+b;
           if(c>60){
            count++;
           }
        }
        return count;
    }
}