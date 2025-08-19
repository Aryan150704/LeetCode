class Solution {
    public int fin(int n,int[] arr){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(arr[n]!=0)
        return arr[n];
        arr[n]= fin(n-1,arr)+fin(n-2,arr);
        return arr[n];
    }
    public int fib(int n) {
        int[] arr=new int[n+1];
        return fin(n,arr);
    }
}