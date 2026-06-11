class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // m -> bookey
        // k -> flowers
        if(m*k>bloomDay.length) return -1;

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        while(min<=max){
            int mid=min+(max-min)/2;
            if(checker(bloomDay,mid,m,k)){
                ans=mid;
                max=mid-1;
            }
            else min=mid+1;
        }
        /*
        for(int i=min;i<=max;i++){
            if(checker(bloomDay,i,m,k)){
                ans=i;
                break;
            }
        }
        */
        return ans;
    }
    public boolean checker(int[] arr, int midDay, int targetBouquets, int flowersPerBouquet) {
    int consecutiveFlowers = 0;
    int bouquetsMade = 0;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= midDay) {
            consecutiveFlowers++; // Flower has bloomed, increment streak
            
            if (consecutiveFlowers == flowersPerBouquet) {
                bouquetsMade++;         // Made a bouquet!
                consecutiveFlowers = 0; // Reset streak for the next bouquet
            }
        } else {
            consecutiveFlowers = 0; // Streak broken by an unbloomed flower
        }
    }
    
    return bouquetsMade >= targetBouquets;
}
}