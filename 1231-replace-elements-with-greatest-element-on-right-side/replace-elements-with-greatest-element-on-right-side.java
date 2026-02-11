class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        int prev=arr[n];
        int blank=arr[n];
        for(int i=n;i>=0;i--){
            if(i==n){
                arr[i]=-1;
            }
            else{
                blank=arr[i];
                arr[i]=prev;
                if(blank>prev){
                    prev=blank;
                }
            }
        }
        return arr;
    }
}