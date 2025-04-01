class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int start=0;
        int end=max(c);
        int ans=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(dec(mid,c)){
                start=mid+1;
                ans=mid;
            }
            else end=mid-1;
        }
        return ans;
    }
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public boolean dec(int mid,int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(mid<=arr[i]) count++;
        }
        if(count>=mid) return true;
        return false;
    }
}