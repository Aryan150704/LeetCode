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
    public boolean checker(int[] arr,int n,int bookey,int flower){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i]<=n)count++;
            else if(flower==1 && arr[i]<=n)count++;
            else if((i!=0)&&(arr[i-1] <= n && arr[i]<=n))count++;
            else if((i!=0)&&(arr[i-1]>n && arr[i]<=n))count=1;
            else count=0;
            if(count==flower){
                count=0;
                bookey--;
            }
            
        }
        if(bookey<=0)return true;
        return false;
    }
}