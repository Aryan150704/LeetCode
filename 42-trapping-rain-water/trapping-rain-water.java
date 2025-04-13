class Solution {
    public int trap(int[] height) {
        if(height.length==0||height.length==1||height.length==2)
        return 0;
        int ll[]=new int[height.length];
        int ml[]=new int[height.length];
        int sum=0;
        for(int i=0;i<height.length;i++){
            if(sum<height[i]){
                sum=height[i];
            }
            ll[i]=sum;
        }
        sum=0;
        for(int i=height.length-1;i>=0;i--){
            if(sum<height[i]){
                sum=height[i];
            }
            ml[i]=sum;
        }
        sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(ll[i],ml[i])-height[i];
        }
        return sum;
    }
}