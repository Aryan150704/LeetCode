class Solution {
    public int findKthLargest(int[] a, int k) {
         int max=a[0], min=a[0];
        for(int n:a){
            if(n>max)
                max=n;
            else if(n<min)
                min=n;
        }
        int[] freq=new int[max-min+1];
        for(int n:a){
            freq[n-min]++;
        }
        for(int i=freq.length-1;i>=0;i--){
            k-=freq[i];
            if(k<=0)
                return i+min;
        }
        return -1;
    }
}