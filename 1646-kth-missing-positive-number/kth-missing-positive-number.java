class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr=0,i=0;
        while(k>0){
            curr++;
            if(i<arr.length && arr[i]==curr) i++;
            else k--;
        }
        return curr;
    }
}