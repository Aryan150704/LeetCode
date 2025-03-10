class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int ans =0;
        int left=0;
        int n = colors.length;
        for(int right=1;right<n+k-1;right++){
            if(right>0 && colors[right%n]==colors[(right-1)%n])     
                left=right;
            if((right-left+1) >=k){
                ans++;
                left++;
        }
        }
        return ans;
    }
}