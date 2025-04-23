class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int arrSum=0;
        int minsum=Integer.MAX_VALUE;
        int tempmaxsum=0;
        int tempminsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            arrSum+=arr[i];
            if(tempmaxsum<0)
                tempmaxsum=arr[i];
            else
            tempmaxsum+=arr[i];
            maxsum=Math.max(maxsum,tempmaxsum);
            if(tempminsum>0) 
                tempminsum=arr[i];
            else
                tempminsum+=arr[i];
            minsum=Math.min(minsum,tempminsum);
        }
        if(arrSum==minsum) return maxsum;
        return Math.max(maxsum,(arrSum-minsum));
    }
}