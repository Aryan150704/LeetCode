class Solution {
    public int missingNumber(int[] nums) {
        int totalSum=0;
        int arraySum=0;
        int max=0;
        boolean hasZero=false;
        int k=1;
        for(int i:nums){
            max=Math.max(max,i);
            if(i==0)hasZero=true;
            arraySum+=i;
        }
        for(int i=1;i<=max;i++){
            totalSum+=i;
        }
        if(arraySum==totalSum && hasZero==false)return 0;
        else if(arraySum==totalSum && hasZero)return max+1;
        return totalSum-arraySum;
    }
}