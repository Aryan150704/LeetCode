class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0;
        int max=0;
        int ans=-1;
        for(int i=0;i<weights.length;i++){
            max+=weights[i];
            min=Math.max(min,weights[i]);
        }
        while(min<=max){
            int mid=min+(max-min)/2;
            if(checker(mid,weights,days)){
                ans=mid;
                max=mid-1;
            }
            else{
                
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean checker(int m,int arr[],int d){
        int sum=0;
        int used=1;
        for(int i=0;i<arr.length;i++){
            if((sum+arr[i])>m){
                used++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return used<=d;
    }
}