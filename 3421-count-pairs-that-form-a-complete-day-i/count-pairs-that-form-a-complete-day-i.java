class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count=0;
        if(hours.length==1) return 0;
        for(int i=1;i<hours.length;i++){
            for(int j=0;j<i;j++){
                if((hours[i]+hours[j])%24==0)count++;
            }
        }
        return count;
    }
}