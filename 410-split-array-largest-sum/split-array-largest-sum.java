class Solution {
    public int splitArray(int[] arr, int k) {
        if(k>arr.length)return -1;
        int min=0;
        int max=0;
        for(int a:arr){
            min=Math.max(min,a);
            max+=a;
        }
        int ans=max;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(outputer(mid,arr,k)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean outputer(int n, int[] arr,int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>n){
                k--;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        if(k>=1)return true;
        return false;
    }
}