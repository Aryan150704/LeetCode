class Solution {
    public int weightfinder(int mid,int[] weight){
        int container=0;
        int count=1;
        for(int i=0;i<weight.length;i++){
            if(container+weight[i]<=mid){
            container+=weight[i];
            }
            else{
                count++;
                container=weight[i];
            }
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int i=0;i<weights.length;i++){
            l=Math.max(l,weights[i]);
            r=r+weights[i];
        }
        int value =0;
        while(l<=r){
            int mid=l+(r-l)/2;
            value=weightfinder(mid,weights);
            if(value>days){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        } 
        return l;
    }
}