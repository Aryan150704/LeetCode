class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        int ind=-1;
        if(arr[high]-arr.length==0)return arr.length+k;
        if(arr[high]<=high+k) return arr[high]+(k-(arr[high]-high-1)) ;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-mid-1;
            if(missing<k){
                low=mid+1;
            }
            else {
                high=mid-1;
                ans=arr[mid];
                ind=mid;
            }
        }
        return ans-((arr[ind]-ind)-k);
    }
}