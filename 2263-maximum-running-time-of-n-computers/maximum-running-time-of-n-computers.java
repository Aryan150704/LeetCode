class Solution {
    public boolean capable(int[] b,int n,long mid){
        long sum=0;
        for(int i=0;i<b.length;i++){
            sum+=Math.min(mid,b[i]);
        }
        return sum >= mid * n;
    }
    public long maxRunTime(int n, int[] batteries) {
        long min=1;
        long sum=0;
        for(int i=0;i<batteries.length;i++){
            min=Math.min(min,batteries[i]);
            sum+=batteries[i];
        }
        long max=sum/n;
        while(min<=max){
            long mid=min+(max-min)/2;
            if(capable(batteries,n,mid)) min=min = mid + 1;
            else max=mid - 1;
        }
        return max;
    }
}