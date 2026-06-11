class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long min=1;
        long max=0;
      
        for(int i=0;i<piles.length;i++){
            max+=piles[i];
        }
        long ans=max;
        while(min<=max){
            long mid=min+(max-min)/2;
            if(checker(mid,piles,h)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return (int)ans;
    }
    public boolean checker(long n,int[] arr,int k){
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%n!=0){
                num+=arr[i]/n+1;
            }
            else num+=arr[i]/n;
        }
        if(num>k)return false;
        return true;
    }
}