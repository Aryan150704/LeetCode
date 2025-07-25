class Solution {
    public int hIndex(int[] citations) {
        int count=0;
        int n=citations.length;
        int[] arr=new int[n+1];
        for(int i=0;i<citations.length;i++){
            if(citations[i]>n) arr[n]++;
            else arr[citations[i]]++;
        }
        for(int i=n;i>=0;i--){
            count+=arr[i];
            if(count>=i)return i;
        }
        return 0;
    }
}