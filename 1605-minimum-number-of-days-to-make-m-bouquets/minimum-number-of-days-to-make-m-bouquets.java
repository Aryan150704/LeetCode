class Solution {
    public boolean valid(int[] arr, int day, int m, int k) {
    int bouquets = 0;
    int flowers = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= day) {
            flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minimumDays=-1;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        while(min<=max){
            int mid=min+(max-min)/2;
            if(valid(bloomDay,mid,m,k)){
                max=mid-1;
                minimumDays=mid;
            }
            else{
                min=mid+1;
            }
        }
        return minimumDays;
    }
}